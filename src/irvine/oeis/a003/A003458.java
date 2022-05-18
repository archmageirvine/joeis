package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003458 Erd\u0151s-Selfridge function: a(n) is the least number m &gt; n+1 such that the least prime factor of binomial(m, n) is &gt; n.
 * @author Sean A. Irvine
 */
public class A003458 implements Sequence {

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
    Jaguar.factor(num);
    m = n - m;
    final FactorSequence den = new FactorSequence();
    while (m > 1) {
      den.add(m--, FactorSequence.UNKNOWN);
    }
    Jaguar.factor(den);
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
