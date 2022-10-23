package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048299 Let b(n) = A048273(n) = maximal number of prime factors of C(n,k) for k=0..n; sequence gives smallest value of k achieving b(n).
 * @author Sean A. Irvine
 */
public class A048299 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    long maxk = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      final long t = mFactor.factorize(Binomial.binomial(mN, k)).omega();
      if (t > max) {
        max = t;
        maxk = k;
      }
    }
    return Z.valueOf(maxk);
  }
}

