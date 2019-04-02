package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028366 a(n) = (2^n - 1)!.
 * @author Sean A. Irvine
 */
public class A028366 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      for (long n = 1 << (mN - 1); n < 1 << mN; ++n) {
        mF = mF.multiply(n);
      }
    }
    return mF;
  }
}
