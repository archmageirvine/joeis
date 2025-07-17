package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A385866 allocated for Binay Krishna Maity.
 * @author Sean A. Irvine
 */
public class A385866 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    final long t = mN - mM;
    return Z.valueOf((t * t - 1) / mN + 1);
  }
}
