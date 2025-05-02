package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381103.
 * @author Sean A. Irvine
 */
public class A155031 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mM == mN
      ? Z.ONE
      : mN % mM == 0 ? Z.ZERO : Z.NEG_ONE;
  }
}
