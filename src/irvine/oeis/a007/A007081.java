package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007081.
 * @author Sean A. Irvine
 */
public class A007081 implements Sequence {

  private static final Z[] C = {Z.ONE, Z.ONE, Z.ONE};
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    MultivariatePolynomial p = MultivariatePolynomial.one(mN);
    final int[] degreeLimits = new int[mN];
    Arrays.fill(degreeLimits, mN - 1);
    for (int k = 0; k < mN; ++k) {
      for (int j = k + 1; j < mN; ++j) {
        final int[][] t = new int[3][mN];
        t[0][k] = 2;
        t[1][j] = 2;
        t[2][j] = 1;
        t[2][k] = 1;
        final MultivariatePolynomial xkxj = new MultivariatePolynomial(mN, t, C);
        p = p.multiply(xkxj, degreeLimits);
      }
    }
    return p.get(new MultivariatePolynomial.Term(degreeLimits));
  }
}
