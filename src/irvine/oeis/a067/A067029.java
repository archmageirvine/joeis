package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A067029 Exponent of least prime factor in prime factorization of n, a(1)=0.
 * @author Sean A. Irvine
 */
public class A067029 extends AbstractSequence implements DirectSequence {

  private long mN;

  /** Construct the sequence. */
  public A067029() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return Z.valueOf(fs.getExponent(fs.leastPrimeFactor()));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final long lpf = LeastPrimeFactorizer.lpf(Z.valueOf(mN)).longValueExact();
    long m = mN / lpf;
    long c = 1;
    while (m % lpf == 0) {
      ++c;
      m /= lpf;
    }
    return Z.valueOf(c);
  }
}
