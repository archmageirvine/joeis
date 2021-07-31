package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025144 Numbers n such that (#1's in (s(1),...,s(n)) = (#1's in r(1),...,r(n)), where s = A025142 and r = A025143.
 * @author Sean A. Irvine
 */
public class A025144 extends A025142 {

  protected long mACount = 0;
  protected long mBCount = 0;
  private long mPos = 0;

  @Override
  protected boolean select(final long n) {
    if (!mA025142.isSet(n)) {
      ++mACount;
    }
    if (!mA025143.isSet(n)) {
      ++mBCount;
    }
    return false;
  }

  @Override
  public Z next() {
    do {
      super.next();
      ++mPos;
    } while (mACount != mBCount);
    return Z.valueOf(mPos);
  }
}
