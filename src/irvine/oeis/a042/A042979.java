package irvine.oeis.a042;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A042979 Number of degree-n irreducible polynomials over GF(2) with trace = 0 and subtrace = 1.
 * @author Sean A. Irvine
 */
public class A042979 implements Sequence {

  // After Joerg Arndt

  private long mN = 0;

  protected Z l(final long n, final long k) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(LongUtils.gcd(n, k)).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(n / d, k / d).multiply(Mobius.mobius(d)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 4 - (mN & 3); k <= mN; k += 4) {
      sum = sum.add(l(mN, k));
    }
    return sum.divide(mN);
  }
}
