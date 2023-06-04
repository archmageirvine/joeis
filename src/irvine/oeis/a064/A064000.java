package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064000 Unitary untouchable numbers of second kind: numbers n such that usigma(x) = n has no solution, where usigma(x) (A034448) is the sum of unitary divisors of x.
 * @author Sean A. Irvine
 */
public class A064000 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM <= mN * mN) {
        mSeen.set(Jaguar.factor(++mM).unitarySigma().longValueExact());
      }
      if (!mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
