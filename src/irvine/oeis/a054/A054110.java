package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054110 Triangular array T(n,k): in Pascal's triangle, draw vertical lines through binomial(n-1,k-1) (if present) and binomial(n-1,k) (if present); then T(n,k) is the sum of binomial(i,j) that lie on or between the lines and not below binomial(n,k).
 * @author Sean A. Irvine
 */
public class A054110 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long k) {
    if (k == 0 || k == n) {
      // I think an argument can be made that this value should be 2 except for (0,0)
      return Z.ONE; // one of the lines does not exist
    }
    Z sum = Z.ZERO;
    for (long j = n, i = k; i >= 0 && i <= j; j -= 2, --i) {
      sum = sum.add(Binomial.binomial(j, i));
    }
    for (long j = n - 1, i = k - 1; i >= 0 && i <= j; j -= 2, --i) {
      sum = sum.add(Binomial.binomial(j, i));
    }
    for (long j = n - 1, i = k; i >= 0 && i <= j; j -= 2, --i) {
      sum = sum.add(Binomial.binomial(j, i));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
