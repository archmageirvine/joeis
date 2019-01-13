package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004788.
 * @author Sean A. Irvine
 */
public class A004788 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = new FactorSequence();
    for (long k = 1; k <= mN / 2; ++k) {
      fs.merge(Cheetah.factor(Binomial.binomial(mN, k)));
    }
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(fs.omega());
  }
}

