package irvine.oeis.a008;

import java.util.Arrays;
import java.util.Map;

import irvine.math.group.IntegerField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008300 Triangle read by rows: T(n,k) (n &gt;= 0, 0 &lt;= k &lt;= n) gives number of {0,1} n X n matrices with all row and column sums equal to k.
 * @author Sean A. Irvine
 */
public class A008300 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  // Direct implementation extracting coefficient [x_1^m ... x_n^m y_1^m ... y_n^m]
  // from product(product(1+x_i*y_i, j=1..n), i=1..n)
  // Uses a lot of memory and no good for more than a few terms

  private MultivariatePolynomial<Z> mP = null;

  private Z coeff(final MultivariatePolynomial<Z> p, final int m) {
    for (final Map.Entry<MultivariatePolynomial.Term, Z> e : p.entrySet()) {
      final MultivariatePolynomial.Term key = e.getKey();
      boolean ok = true;
      for (int k = 0; k < 2 * mN; ++k) {
        if (key.get(k) != m) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return e.getValue();
      }
    }
    throw new RuntimeException();
  }

  private MultivariatePolynomial<Z> make(final int n, final int i, final int j) {
    final int[][] terms = new int[2][2 * n];
    terms[1][i] = 1;
    terms[1][n + j] = 1;
    return new MultivariatePolynomial<>(IntegerField.SINGLETON, 2 * n, terms, Arrays.asList(Z.ONE, Z.ONE));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      MultivariatePolynomial<Z> p = MultivariatePolynomial.one(IntegerField.SINGLETON, 2 * mN);
      for (int i = 0; i < mN; ++i) {
        for (int j = 0; j < mN; ++j) {
          p = p.multiply(make(mN, i, j));
        }
      }
      //System.out.println(p);
      mP = p;
    }
    return coeff(mP, mM);
  }
}
