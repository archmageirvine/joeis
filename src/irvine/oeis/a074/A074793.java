package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a246.A246655;

/**
 * A074767.
 * @author Sean A. Irvine
 */
public class A074793 extends Sequence1 {

  private final Sequence mPrimePowers = new A246655();
  private long mPP = mPrimePowers.next().longValueExact();
  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mPP) {
      mSum = mSum.add(mPP);
      mPP = mPrimePowers.next().longValueExact();
    }
    return mSum;
  }
}
