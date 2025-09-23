package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080543 In binary representation: keep the first digit and rotate left the others twice.
 * @author Sean A. Irvine
 */
public class A080543 extends Sequence1 {

  private long mN = 0;
  private long mM = 4;
  private long mS = 0;

  @Override
  public Z next() {
    if (++mN <= 7) {
      return Z.valueOf(mN);
    }
    if (mN >= 2 * mM) {
      mM *= 2;
      ++mS;
    }
    return Z.valueOf(mM | ((mN << 2) & (mM - 1)) | ((mN >>> mS) & 3));
  }
}

