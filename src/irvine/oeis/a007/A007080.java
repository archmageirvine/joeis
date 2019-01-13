package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007080.
 * @author Sean A. Irvine
 */
public class A007080 implements Sequence {

  private static final Z[] C1 = {Z.TWO};
  private static final Z[] C2 = {Z.ONE, Z.ONE};
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    MultivariatePolynomial p = MultivariatePolynomial.one(mN);
    final int[] degreeLimits = new int[mN];
    Arrays.fill(degreeLimits, mN);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        final Z[] coeff;
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
        final MultivariatePolynomial xkxj = new MultivariatePolynomial(mN, t, coeff);
        p = p.multiply(xkxj, degreeLimits);
      }
    }
    return p.get(new MultivariatePolynomial.Term(degreeLimits)).shiftRight(mN);
  }
}
