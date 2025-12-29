package irvine.oeis.a390;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390833 Array read by antidiagonals: A(k, n) is the number of undirected Hamiltonian paths on the k X n knight graph.
 * @author Sean A. Irvine
 */
public class A390833 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (long j = 0; 2 * j <= mN; ++j) {
      for (long i = 0; i <= Math.min(mN / 2, mN - j); ++i) {
        final Z t = Binomial.binomial(2 * j, j).divide(j + 1).multiply(Binomial.binomial(mN, 2 * j)).multiply(Binomial.binomial(2 * mN - 2 * i - 2 * j, mN - i - j)).multiply(Binomial.binomial(mN - i, i)).multiply(Binomial.binomial(i, mM)).divide(mN - i - j + 1).multiply(Z.NEG_ONE.pow(i - mM));
        sum = sum.add(t);
      }
    }
    return sum;
  }
}
