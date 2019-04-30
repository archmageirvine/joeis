package irvine.oeis.a016;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016025 Least k such that <code>(tau(k^k)+k-1)/k=n</code>.
 * @author Sean A. Irvine
 */
public class A016025 implements Sequence {

  private final Cheetah mFactor = new Cheetah();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      final FactorSequence fs = new FactorSequence();
      fs.add(++k, FactorSequence.UNKNOWN, k);
      mFactor.factor(fs);
      if (fs.sigma0AsLong() + k - 1 == mN * k) {
        return Z.valueOf(k);
      }
    }
  }
}
