package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052174 Triangle of numbers arising in enumeration of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A052174 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    final long k = (n - m) / 2;
    if (((n - m) & 1) == 0) {
      return Binomial.binomial(n + 1, k).multiply(Binomial.binomial(n, k))
        .subtract(Binomial.binomial(n + 1, k).multiply(Binomial.binomial(n, k - 1)));
    } else {
      return Binomial.binomial(n + 1, k).multiply(Binomial.binomial(n, k + 1))
        .subtract(Binomial.binomial(n + 1, k + 1).multiply(Binomial.binomial(n, k - 1)));
    }
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
