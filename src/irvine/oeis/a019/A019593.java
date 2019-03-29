package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019593.
 * @author Sean A. Irvine
 */
public class A019593 extends A019592 {

  private long mN = 0;
  private long mBest = 0;

  @Override
  public Z next() {
    while (true) {
      final long count = count(++mN);
      if (count > mBest) {
        mBest = count;
        return Z.valueOf(mBest + mN);
      }
    }
  }
}
