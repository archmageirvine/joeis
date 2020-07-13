package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a010.A010785;

/**
 * A033702 Number of polygonal numbers which are n-digit repdigits.
 * @author Sean A. Irvine
 */
public class A033702 extends A010785 {

  {
    super.next();
  }

  @Override
  public Z next() {
    long c = 0;
    for (int k = 1; k < 10; ++k) {
      final Z r = super.next();
      if (!Z.ONE.equals(r)) {
        final Z t = r.multiply2();
        for (final Z n : Jaguar.factor(t).divisors()) {
          if (!Z.ONE.equals(n)) {
            final Z q = t.divide(n);
            final Z n1 = n.subtract(1);
            if (q.mod(n1).equals(Z.TWO.mod(n1))) {
              ++c;
            }
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}
