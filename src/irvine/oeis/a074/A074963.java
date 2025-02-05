package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074934.
 * @author Sean A. Irvine
 */
public class A074963 extends Sequence1 {

  private Z mMax = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      mMax = mMax.max(Functions.SIGMA1.z(k * mN));
    }
    return mMax;
  }
}
