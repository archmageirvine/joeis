package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A069825 Numbers n such that there is no x &lt; n such that sigma(x) = phi(n).
 * @author Sean A. Irvine
 */
public class A069825 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (!mSeen.isSet(fs.phi().longValueExact())) {
        mSeen.set(fs.sigma().longValueExact());
        return Z.valueOf(mN);
      }
      mSeen.set(fs.sigma().longValueExact());
    }
  }
}

