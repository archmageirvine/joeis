package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000384;

/**
 * A039594 Hexamorphic numbers: k such that the k-th hexagonal number ends with k.
 * @author Sean A. Irvine
 */
public class A039594 extends A000384 {

  private long mN = 0;
  private long mLim = 10;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z h = super.next();
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (h.mod(mLim) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
