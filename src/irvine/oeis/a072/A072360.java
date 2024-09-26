package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072360 One-sixth the area of the smallest primitive d-arithmetic triangle, where d=A072330(n).
 * @author Sean A. Irvine
 */
public class A072360 extends A072330 {

  @Override
  public Z next() {
    final Z d = super.next();
    if (Z.ONE.equals(d)) {
      return Z.ONE;
    }
    for (Z b = d.multiply2(); true; b = b.add(1)) {
      final Z a = b.subtract(d);
      final Z c = b.add(d);
      final Q p = new Q(a.add(b).add(c), 2);
      if (p.isInteger() && Functions.GCD.z(a, b, c).equals(Z.ONE)) {
        final Z q = p.toZ();
        final Z a2 = q.multiply(q.subtract(a)).multiply(q.subtract(b)).multiply(q.subtract(c));
        final Z[] sqrt = a2.sqrtAndRemainder();
        if (sqrt[1].isZero()) {
          final Z area = sqrt[0];
          return area.divide(6);
        }
      }
    }
  }
}
