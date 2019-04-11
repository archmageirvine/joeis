package irvine.oeis.a016;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016017 Smallest k such that <code>1/k</code> can be written as a sum of exactly 2 unit fractions in n ways.
 * @author Sean A. Irvine
 */
public class A016017 implements Sequence {

  private final Cheetah mFactor = new Cheetah();
  protected long mN = 0;

  protected int v() {
    return 2;
  }

  @Override
  public Z next() {
    mN += v();
    long k = 0;
    while (true) {
      final FactorSequence fs = new FactorSequence();
      fs.add(++k, FactorSequence.UNKNOWN, v());
      mFactor.factor(fs);
      if (fs.sigma0() + v() - 1 == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
