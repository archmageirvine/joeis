package irvine.oeis.a101;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A101756 Number of divisors of highly composite triangular numbers.
 * @author Sean A. Irvine
 */
public class A101756 extends Sequence1 {

  private Z mBest = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++mN);
      final Z s = Functions.SIGMA0.z(t);
      if (s.compareTo(mBest) > 0) {
        mBest = s;
        return mBest;
      }
    }
  }
}
