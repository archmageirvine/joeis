package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000384;

/**
 * A038494 Images of hexamorphic numbers: suppose k-th hexagonal number H(k) (A000384) ends in k; sequence gives positive values of H(k).
 * @author Sean A. Irvine
 */
public class A038494 extends A000384 {

  private long mN = 0;
  private long mLim = 10;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (t.mod(mLim) == mN) {
        return t;
      }
    }
  }
}
