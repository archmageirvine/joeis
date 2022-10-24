package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A060096 Numerator of coefficients of Euler polynomials (rising powers).
 * E(n,m)=(n/m)*E(n-1,m-1), n&gt;=1,m&gt;=1.
 * E(n, 0)=-n*sum(E(n-1,j)/(2*(j + 1)),j=0..n-1), n&gt;=1, r(0, 0)=1.
 * @author Georg Fischer
 */
public class A060096 extends RationalTriangle {

  /** Construct the sequence. */
  public A060096() {
    hasRAM(false);
  }

  @Override
  public Q compute(final int n, final int m) {
    if (n == 0) {
      return Q.ONE;
    } else if (m == 0) {
      Q sum = Q.ZERO;
      for (int j = 0; j < n; ++j) {
        sum = sum.add(get(n - 1, j).divide(2L * (j + 1)));
      }
      return sum.multiply(-n);
    } else {
      return get(n - 1, m - 1).multiply(new Q(n, m));
    }
  }
}
