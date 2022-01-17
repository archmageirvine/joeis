package irvine.oeis.a053;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053868 Numbers whose sum of proper divisors is odd.
 * @author Sean A. Irvine
 */
public class A053868 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().subtract(mN).isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
