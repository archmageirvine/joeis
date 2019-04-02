package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a003.A003658;

/**
 * A014046 Second coordinate of fundamental unit of real quadratic field with discriminant A003658(n), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A014046 extends A003658 {

  // Based on Keith Matthews
  // http://www.numbertheory.org/gnubc/unit

  // Returns the fundamental unit and the norm
  protected Z[] fundamentalUnit(final Z bigD) {
    final Z d = bigD.mod(4) == 0 ? bigD.divide(4) : bigD;
    if (Z.FIVE.equals(d)) {
      return new Z[] {Z.ZERO, Z.ONE, Z.NEG_ONE};
    }
    final Z[] sqrt = d.sqrtAndRemainder();
    if (Z.ZERO.equals(sqrt[0])) {
      // d is a perfect square, undefined
      return null;
    }
    final Z p = sqrt[0];
    final Z h = p.subtract(1).divide2();
    final Z t = h.multiply2().add(1);
    final long z = d.mod(4);
    Z b;
    Z c;
    if (z == 1) {
      b = t;
      c = Z.TWO;
    } else {
      b = p;
      c = Z.ONE;
    }
    if (d.equals(p.square().add(1))) {
      // period 1, exceptional case
      if (z == 1) {
        return new Z[] {p.subtract(1), Z.TWO, Z.NEG_ONE};
      } else {
        return new Z[] {p, Z.ONE, Z.NEG_ONE};
      }
    }
    if (d.equals(t.square().add(4))) {
      // period 1, exceptional case
      return new Z[] {h, Z.ONE, Z.NEG_ONE};
    }

    // Continued fraction expansion
    b = p.add(b).divide(c).multiply(c).subtract(b);
    c = d.subtract(b.square()).divide(c);
    Z u1 = Z.ONE;
    Z u2 = d.mod(4) == 1 ? h : p;
    Z v1 = Z.ZERO;
    Z v2 = Z.ONE;

    boolean even = true;
    while (true) {
      even = !even;
      final Z q = p.add(b).divide(c);
      final Z b0 = b;
      b = q.multiply(c).subtract(b);
      final Z c0 = c;
      c = d.subtract(b.square()).divide(c);
      final Z u0 = u1;
      final Z v0 = v1;
      final Z u = u2.multiply(q).add(u1);
      final Z v = v2.multiply(q).add(v1);
      u1 = u2;
      v1 = v2;
      u2 = u;
      v2 = v;
      // u/v is the ith convergent to sqrt(d) or (sqrt(d)-1)/2
      if (b.equals(b0)) {
        // Even period
        return new Z[] {v1.multiply(u.add(u0)).signedAdd(even, Z.ONE), v1.multiply(v.add(v0)), Z.ONE};
      }
      if (c.equals(c0)) {
        // Odd period
        return new Z[] {u.multiply(v).add(u1.multiply(v1)), v.square().add(v1.square()), Z.NEG_ONE};
      }
    }
  }

  protected Z select(final Z[] res) {
    return res[1];
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return select(fundamentalUnit(n));
  }
}
