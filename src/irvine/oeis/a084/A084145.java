package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A084145 First digit occurring consecutively at least n times in Pi's decimal expansion.
 * @author Sean A. Irvine
 */
public class A084145 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private Z mPrev = null;
  private Z mD = mPi.next();
  private long mN = 0;
  private long mCount = 0;

  private void update() {
    mPrev = mD;
    mCount = 1;
    while (true) {
      mD = mPi.next();
      if (!mD.equals(mPrev)) {
        return;
      }
      ++mCount;
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mCount < mN) {
      update();
    }
    return mPrev;
  }
}

