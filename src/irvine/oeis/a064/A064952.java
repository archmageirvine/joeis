package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064952 Number of odd terms among first n terms of A064413.
 * @author Sean A. Irvine
 */
public class A064952 extends A064413 {

  private long mCnt = 0;

  @Override
  public Z next() {
    if (super.next().isOdd()) {
      ++mCnt;
    }
    return Z.valueOf(mCnt);
  }
}
