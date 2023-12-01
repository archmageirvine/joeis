package irvine.oeis.a067;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067029 Exponent of least prime factor in prime factorization of n, a(1)=0.
 * @author Sean A. Irvine
 */
public class A067029 extends Sequence1 {

  private long mN = 0;

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
