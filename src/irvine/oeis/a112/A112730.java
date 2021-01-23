package irvine.oeis.a112;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A112730 Numbers n such that the equation sigma(x)-phi(x)=n has at least one solution.
 * @author Sean A. Irvine
 */
public class A112730 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(1 + 2 * LongUtils.sqrt(mN))) >= 0) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z t = fs.sigma().subtract(fs.phi());
      if (t.compareTo(mPrev) > 0) {
        mA.add(t);
      }
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
