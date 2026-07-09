package irvine.oeis.a112;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A112401 1-digit squares with their digits reversed, then 2-digit squares reversed, and so on, including squares zero-padded on the left but excluding squares ending in 0.
 * @author Sean A. Irvine
 */
public class A112401 extends Sequence1 {

  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      ++mN;
    }
    long s = mN * mN;
    if (s >= mLim) {
      mLim *= 10;
      mN = 1;
      s = 1;
    }
    long r = Functions.REVERSE.l(s);
    while (10 * r < mLim) {
      r *= 10;
    }
    return Z.valueOf(r);
  }
}
