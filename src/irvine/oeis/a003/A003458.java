package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003458 Erd&#337;s-Selfridge function: <code>a(n)</code> is the least number m <code>&gt; n+1</code> such that the least prime factor of binomial(m, <code>n)</code> is <code>&gt; n</code>.
 * @author Sean A. Irvine
 */
public class A003458 implements Sequence {

  private final Cheetah mFactor = new Cheetah();
  private long mN = 0;

  private Z lprFactoredBinomial(final long n, long m) {
    assert n >= m;
    final FactorSequence num = new FactorSequence();
    if (m < n / 2) {
      m = n - m;
    }
    for (long k = m + 1; k <= n; ++k) {
      num.add(k, FactorSequence.UNKNOWN);
    }
    mFactor.factor(num);
    if (!num.isComplete()) {
      throw new UnsupportedOperationException();
    }
    m = n - m;
    final FactorSequence den = new FactorSequence();
    while (m > 1) {
      den.add(m--, FactorSequence.UNKNOWN);
    }
    mFactor.factor(den);
    if (!den.isComplete()) {
      throw new UnsupportedOperationException();
    }
    for (final Z p : num.toZArray()) {
      final int pe = num.getExponent(p);
      final int de = den.getExponent(p);
      if (pe > de) {
        return p;
      }
    }
    return Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    long m = mN + 1;
    while (true) {
      if (lprFactoredBinomial(++m, mN).compareTo(n) > 0) {
        return Z.valueOf(m);
      }
    }
  }
}
