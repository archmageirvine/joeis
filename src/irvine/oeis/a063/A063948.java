package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A063948 Unitary untouchable numbers: us(x) = n has no solution where us(x) (A063919) is the sum of the proper unitary divisors of x.
 * @author Sean A. Irvine
 */
public class A063948 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM <= mN * mN) {
        mSeen.set(Jaguar.factor(++mM).unitarySigma().subtract(mM).longValueExact());
      }
      if (!mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
