package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A054435 Smallest area of a Pythagorean triangle with n as length of one of the three sides.
 * @author Sean A. Irvine
 */
public class A054435 extends A054436 {

  private long mN = 2;

  @Override
  public Z next() {
    Z min = super.next(); // deals with legs
    // deal the hypotenuse
    final long n2 = ++mN * mN;
    for (long a = 1; a < mN; ++a) {
      final long b2 = n2 - a * a;
      final long b = Functions.SQRT.l(b2);
      if (b * b == b2) {
        min = min.min(Z.valueOf(a * b / 2));
      }
    }
    return min;
  }
}
