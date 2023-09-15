package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065760 Concatenation of increasing number of alternating digits in base 2, starting with 1.
 * @author Sean A. Irvine
 */
public class A065760 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mA = (++mN & 1) == 0 ? mA.shiftLeft(mN) : mA.add(1).shiftLeft(mN).subtract(1);
    return mA;
  }
}
