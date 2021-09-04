package irvine.oeis.a115;
// manually 2021-09-04

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A115241 Square array read by antidiagonals: T(n,p) is the number of linearly independent, homogeneous harmonic polynomials of degree n in p variables (n,p&gt;=1). 
 * T(n,p) = (2n+p-2) * binomial(n+p-3,n-1)/n for n>=1, p>=1.
 * @author Georg Fischer
 */
public class A115241 implements Sequence {

  private long mN = 0;
  private long mK = 0;
  
  private Z table(final long n, final long p) {
    return Z.valueOf(2 * n + p - 2).multiply(Binomial.binomial(n + p - 3, n - 1)).divide(n);
  }

  @Override
  public Z next() {
    if (++mN > mK) {
      ++mK;
      mN = 1;
    }
    return table(mN, mK + 1 - mN);
  }
}
