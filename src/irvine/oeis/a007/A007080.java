package irvine.oeis.a007;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007080 Number of labeled Eulerian digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007080 extends Sequence1 {

  private static final List<Z> C1 = Collections.singletonList(Z.TWO);
  private static final List<Z> C2 = Arrays.asList(Z.ONE, Z.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    MultivariatePolynomial<Z> p = MultivariatePolynomial.one(IntegerField.SINGLETON, mN);
    final int[] degreeLimits = new int[mN];
    Arrays.fill(degreeLimits, mN);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        final List<Z> coeff;
        final int[][] t;
        if (k == j) {
          t = new int[1][mN];
          t[0][k] = 1;
          coeff = C1;
        } else {
          t = new int[2][mN];
          t[0][k] = 1;
          t[1][j] = 1;
          coeff = C2;
        }
        final MultivariatePolynomial<Z> xkxj = new MultivariatePolynomial<>(IntegerField.SINGLETON, mN, t, coeff);
        p = p.multiply(xkxj, degreeLimits);
      }
    }
    return p.get(new MultivariatePolynomial.Term(degreeLimits)).shiftRight(mN);
  }
}
