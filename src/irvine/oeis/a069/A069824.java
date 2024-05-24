package irvine.oeis.a069;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069824 Numbers n such that there is at least one x&lt;n such that phi(x)sigma(x)=phi(n)sigma(n).
 * @author Sean A. Irvine
 */
public class A069824 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = fs.sigma().multiply(fs.phi());
      if (!mSeen.add(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

