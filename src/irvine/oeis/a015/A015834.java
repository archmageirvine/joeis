package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015834 Numbers k such that <code>phi(k) | sigma(k + 1)</code>.
 * @author Sean A. Irvine
 */
public class A015834 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z phi = mFactorSequenceA.phi();
      mFactorSequenceA = Cheetah.factor(++mN);
      if (mFactorSequenceA.sigma().mod(phi).equals(Z.ZERO)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
