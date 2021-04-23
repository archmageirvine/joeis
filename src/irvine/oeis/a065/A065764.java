package irvine.oeis.a065;
// manually

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A065764 Sum of divisors of square numbers.
 * @author Georg Fischer
 */
public class A065764 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Cheetah.factor(mN.square());
    return fs.sigma();
  }
}
