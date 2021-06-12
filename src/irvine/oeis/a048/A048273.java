package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048273 Maximal number of distinct prime factors in binomial coefficients C(n,k) for k = 0,...,n.
 * @author Sean A. Irvine
 */
public class A048273 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      final long t = mFactor.factorize(Binomial.binomial(mN, k)).omega();
      if (t > max) {
        max = t;
      }
    }
    return Z.valueOf(max);
  }
}

