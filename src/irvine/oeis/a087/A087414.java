package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087414 Numbers n such that 2*n*k(n) is rational but not an integer, where k(n) is sum of successive remainders when computing the Euclidean algorithm for (1, 1/sqrt(n)) as defined in A086378 (MuPAD program is given there); numbers belonging to A086378 but not to A088900.
 * @author Sean A. Irvine
 */
public class A087414 extends Sequence1 {

  // After PARI

  private long mN = 0;

  private Z z(final long n) {
    Z b = Functions.SQRT.z(n);
    Z c = Z.valueOf(n).subtract(b.square());
    if (c.isZero()) {
      return Z.ZERO;
    }
    Z a = b;
    Z d = Z.ONE;
    Z f = Z.ONE;
    Z i = Z.ONE;
    Z e = Z.ZERO;
    Z g = Z.ZERO;
    Z h = Z.ZERO;
    Z k;
    final Z j = c;
    do {
      k = d.add(a.multiply(e));
      f = f.multiply(c);
      d = a.multiply(d).add(e.multiply(n));
      e = k;
      g = g.add(i);
      i = i.multiply(c);
      k = g.add(a.multiply(h));
      g = a.multiply(g).add(h.multiply(n));
      h = k;
      k = a.add(b).divide(c);
      g = g.subtract(i.multiply(k));
      a = c.multiply(k).subtract(a);
      c = Z.valueOf(n).subtract(a.square()).divide(c);
    } while (!a.equals(b) || !c.equals(j));
    d = d.divide(f).subtract(1);
    e = e.divide(f);
    g = g.divide(i);
    h = h.divide(i);
    i = d.square().subtract(e.square().multiply(n));
    k = h.multiply(d).subtract(g.multiply(e));
    g = g.multiply(d).subtract(h.multiply(e).multiply(n));
    b = Z.valueOf(n).subtract(a.square());
    a = b.multiply(g).subtract(c.multiply(a).multiply(i));
    c = b.multiply(k).add(i.multiply(c));
    b = b.multiply(i);
    if (!a.isZero()) {
      return Z.ZERO;
    }
    return Z.TWO.mod(b.divide(Functions.GCD.z(b, c.multiply(n))));
  }

  @Override
  public Z next() {
    while (true) {
      if (!z(++mN).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
