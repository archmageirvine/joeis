package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015715 Phi(n) | <code>sigma(n)</code> for n odd.
 * @author Sean A. Irvine
 */
public class A015715 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Cheetah.factor(mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi()))) {
        return mN;
      }
    }
  }
}
