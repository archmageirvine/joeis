package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064474 Number of even terms among first n terms of A064413.
 * @author Sean A. Irvine
 */
public class A064474 extends A064413 {

  private long mCnt = 0;

  @Override
  public Z next() {
    if (super.next().isEven()) {
      ++mCnt;
    }
    return Z.valueOf(mCnt);
  }
}
