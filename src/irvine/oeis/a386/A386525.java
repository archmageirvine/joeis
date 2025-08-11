package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a063.A063655;

/**
 * A386525 allocated for Richard S. Chang.
 * @author Sean A. Irvine
 */
public class A386525 extends Sequence1 {

  private final Sequence mA = new A063655();
  private Z mT = mA.next();
  private long mK = 1;
  private long mRunLength = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN > mRunLength) {
      mRunLength = 1;
      while (true) {
        final Z u = mT;
        mT = mA.next();
        ++mK;
        if (mT.compareTo(u) >= 0) {
          break;
        }
        ++mRunLength;
      }
    }
    return Z.valueOf(mK - mRunLength);
  }
}
