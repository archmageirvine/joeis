package irvine.oeis.a007;

import java.util.Arrays;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007079 Number of labeled regular tournaments with 2n+1 nodes.
 * @author Sean A. Irvine
 */
public class A007079 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    MultivariatePolynomial<Z> p = MultivariatePolynomial.one(IntegerField.SINGLETON, mN);
    final int[] degreeLimits = new int[mN];
    Arrays.fill(degreeLimits, (mN - 1) / 2);
    final List<Z> coeff = Arrays.asList(Z.ONE, Z.ONE);
    for (int k = 0; k < mN; ++k) {
      for (int j = k + 1; j < mN; ++j) {
        final int[][] t = new int[2][mN];
        t[0][k] = 1;
        t[1][j] = 1;
        final MultivariatePolynomial<Z> xkxj = new MultivariatePolynomial<>(IntegerField.SINGLETON, mN, t, coeff);
        p = p.multiply(xkxj, degreeLimits);
      }
    }
    return p.get(new MultivariatePolynomial.Term(degreeLimits));
  }
}
