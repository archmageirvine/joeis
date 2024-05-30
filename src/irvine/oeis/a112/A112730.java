package irvine.oeis.a112;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A112730 Numbers n such that the equation sigma(x)-phi(x)=n has at least one solution.
 * @author Sean A. Irvine
 */
public class A112730 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(1 + 2 * Functions.SQRT.l(mN))) >= 0) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = fs.sigma().subtract(fs.phi());
      if (t.compareTo(mPrev) > 0) {
        mA.add(t);
      }
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
