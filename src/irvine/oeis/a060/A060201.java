package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a003.A003215;

/**
 * A060201 Images of centered hexamorphic numbers: suppose k-th centered hexagonal number H_c(k) (A003215) ends in k; sequence gives value of H_c(k).
 * @author Sean A. Irvine
 */
public class A060201 extends A003215 {

  private long mLim = 10;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mN + 1 >= mLim) {
        mLim *= 10;
      }
      if (t.mod(mLim) == mN + 1) {
        return t;
      }
    }
  }
}
