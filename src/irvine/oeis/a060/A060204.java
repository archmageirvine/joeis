package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000330;

/**
 * A060204 Square pyramorphic numbers: suppose the k-th square pyramidal number S(k) (A000330) ends in k; sequence gives value of S(k).
 * @author Sean A. Irvine
 */
public class A060204 extends A000330 {

  private long mLim = 10;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mN >= mLim) {
        mLim *= 10;
      }
      if (t.mod(mLim) == mN) {
        return t;
      }
    }
  }
}
