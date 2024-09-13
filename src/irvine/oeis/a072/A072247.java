package irvine.oeis.a072;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A072247 Triangle T(n,k) (n &gt;= 2, 2 &lt;= k &lt;= n-1 if n &gt; 2) giving number of non-crossing trees with n nodes and k endpoints.
 * @author Sean A. Irvine
 */
public class A072247 extends Sequence2 {

  // After Andrew Howroyd

  private int mN = 1;
  private int mM = 0;

  // U(n,k) = 2*binomial(n-2, k)*Sum_{j=0..k-1} binomial(n-1, j)*binomial(n-k-2, k-1-j)*2^(n-1-2*k+j)/(n-2) for 2 < k < n
  private Z u(final int n, final int k) {
    assert k > 2 && k < n;
    return Integers.SINGLETON.sum(0, k - 1, j -> Binomial.binomial(n - 1, j).multiply(Binomial.binomial(n - k - 2, k - 1 - j)).shiftLeft(n - 1 - 2L * k + j))
      .multiply(Binomial.binomial(n - 2, k))
      .multiply2()
      .divide(n - 2);
  }

  // T(n, k) = U(n, k-1) - U(n, k) + binomial(n-1, k)*Sum_{j=0..k-1} binomial(n-1, j)*binomial(n-k-1, k-1-j)*2^(n-2*k+j)/(n-1)
  private Z t(final int n, final int k) {
    final Z sum = Integers.SINGLETON.sum(0, k - 1, j -> Binomial.binomial(n - 1, j).multiply(Binomial.binomial(n - k - 1, k - 1 - j)).shiftLeft(n - 2L * k + j));
    return u(n, k - 1)
      .subtract(u(n, k))
      .add(Binomial.binomial(n - 1, k).multiply(sum).divide(n - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 2) {
        return Z.ONE;
      }
      mM = 2;
    }
    return t(mN, mM);
  }
}
