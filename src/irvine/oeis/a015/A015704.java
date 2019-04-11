package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A015704 <code>a(n)</code> is the smallest number m such that phi(m) + sigma(m) = n*m.
 * @author Sean A. Irvine
 */
public class A015704 implements Sequence {

  private final LongDynamicLongArray mSigma = new LongDynamicLongArray();
  private final LongDynamicLongArray mPhi = new LongDynamicLongArray();
  private long mN = 1;

  private long sigma(final long m) {
    final long r = mSigma.get(m);
    if (r != 0) {
      return r;
    }
    final FactorSequence fs = Cheetah.factor(m);
    final long sigma = fs.sigma().longValueExact();
    mSigma.set(m, sigma);
    mPhi.set(m, fs.phi().longValueExact());
    return sigma;
  }

  private long phi(final long m) {
    // Computed this as part of sigma() call
    return mPhi.get(m);
  }

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      if (sigma(m) + phi(m) == mN * m) {
        return Z.valueOf(m);
      }
    }
  }
}
