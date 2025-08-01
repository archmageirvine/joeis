package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386319 allocated for Binay Krishna Maity.
 * @author Sean A. Irvine
 */
public class A386319 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mM == 0 ? Z.ONE : Z.valueOf(mM * (2 * mN - mM + 1) / 2);
  }
}

