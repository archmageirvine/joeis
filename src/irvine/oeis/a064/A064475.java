package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064475 Number of odd terms among first n terms of A064413 (if it begins at 2).
 * @author Sean A. Irvine
 */
public class A064475 extends A064413 {

  private long mCnt = 0;
  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    if (super.next().isOdd()) {
      ++mCnt;
    }
    return Z.valueOf(mCnt);
  }
}
