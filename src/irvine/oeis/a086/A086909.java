package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a072.A072330;

/**
 * A086909 Middle side of the first primitive d-arithmetic triangle, where d=A072330(n).
 * @author Sean A. Irvine
 */
public class A086909 extends A072330 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z d = super.next();
    if (++mN == 1) {
      return Z.FOUR;
    }
    Z b = d.multiply2();
    while (true) {
      final Z a = b.subtract(d);
      final Z c = b.add(d);
      final Z p2 = a.add(b).add(c);
      if (p2.isEven()) {
        final Z p = p2.divide2();
        if (Predicates.SQUARE.is(p.multiply(p.subtract(a)).multiply(p.subtract(b)).multiply(p.subtract(c))) && Functions.GCD.z(a, b, c).isOne()) {
          return b;
        }
      }
      b = b.add(1);
    }
  }
}
