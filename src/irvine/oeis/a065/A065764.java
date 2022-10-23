package irvine.oeis.a065;
// manually

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065764 Sum of divisors of square numbers.
 * @author Georg Fischer
 */
public class A065764 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Jaguar.factor(mN.square());
    return fs.sigma();
  }
}
