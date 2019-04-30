package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015814 Numbers n so <code>phi(n + 1)</code> divides <code>sigma(n)</code>.
 * @author Sean A. Irvine
 */
public class A015814 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
      mFactorSequenceA = Cheetah.factor(++mN);
      if (sigma.mod(mFactorSequenceA.phi()).equals(Z.ZERO)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
