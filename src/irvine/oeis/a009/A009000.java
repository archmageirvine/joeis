package irvine.oeis.a009;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009000 Ordered hypotenuse numbers (squares are sums of 2 distinct nonzero squares).
 * @author Sean A. Irvine
 */
public class A009000 extends Sequence1 {

  private long mN = 4;
  private long mC = 0; // Counts number of solutions for given value of mN

  @Override
  public Z next() {
    while (mC == 0) {
      final long c2 = ++mN * mN;
      long a2;
      for (long a = 1; (a2 = a * a) <= c2 / 2; ++a) {
        final long b2 = c2 - a2;
        final long b = Functions.SQRT.l(b2);
        if (b * b == b2) {
          ++mC;
        }
      }
    }
    --mC;
    return Z.valueOf(mN);
  }
}
