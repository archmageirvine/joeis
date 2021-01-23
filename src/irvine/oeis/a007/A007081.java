package irvine.oeis.a007;

import java.util.Arrays;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007081 Number of labeled Eulerian oriented graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007081 implements Sequence {

  private static final List<Z> C = Arrays.asList(Z.ONE, Z.ONE, Z.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    MultivariatePolynomial<Z> p = MultivariatePolynomial.one(IntegerField.SINGLETON, mN);
    final int[] degreeLimits = new int[mN];
    Arrays.fill(degreeLimits, mN - 1);
    for (int k = 0; k < mN; ++k) {
      for (int j = k + 1; j < mN; ++j) {
        final int[][] t = new int[3][mN];
        t[0][k] = 2;
        t[1][j] = 2;
        t[2][j] = 1;
        t[2][k] = 1;
        final MultivariatePolynomial<Z> xkxj = new MultivariatePolynomial<>(IntegerField.SINGLETON, mN, t, C);
        p = p.multiply(xkxj, degreeLimits);
      }
    }
    return p.get(new MultivariatePolynomial.Term(degreeLimits));
  }
}
