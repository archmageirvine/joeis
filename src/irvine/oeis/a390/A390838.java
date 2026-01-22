package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A390838 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A390838 extends Sequence2 {

  private long mN = 2;
  private long mR = 1;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC > mR) {
      if (++mR >= mN) {
        ++mN;
        mR = 1;
      }
      mC = 1;
    }
    return Z.valueOf((mR * mC) % mN);
  }
}
