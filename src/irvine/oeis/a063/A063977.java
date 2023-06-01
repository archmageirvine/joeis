package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A063977 Numbers which are sums of unitary divisors, the usigma values: their inverse usigma set is not empty; usigma[]=A034448().
 * @author Sean A. Irvine
 */
public class A063977 extends Sequence1 {

  private final LongDynamicBooleanArray mCnts = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM <= mN * mN) {
        mCnts.set(Jaguar.factor(++mM).unitarySigma().longValueExact());
      }
      if (mCnts.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
