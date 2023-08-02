package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028367 a(n) = (2^n-2)!.
 * @author Sean A. Irvine
 */
public class A028367 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      for (long n = (1L << (mN - 1)) - 1; n <= (1L << mN) - 2; ++n) {
        mF = mF.multiply(n);
      }
    }
    return mF;
  }
}
