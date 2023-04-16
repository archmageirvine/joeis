package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A110555 Triangle of partial sums of alternating binomial coefficients: T(n, k) = Sum_{j=0..k} binomial(n, j)*(-1)^j, for n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A110555 extends Triangle {

  private final Triangle mPascal = new Triangle();

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    } else if (n == k) {
      return Z.ZERO;
    } else {
      if ((k & 1) == 0) { // even column
        return mPascal.next();
      } else { // odd column
        return mPascal.next().negate();
      }
    }
  }
}
