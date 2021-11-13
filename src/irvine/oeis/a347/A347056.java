package irvine.oeis.a347;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A347056 Triangle read by rows: T(n,k) = (n+1)*(n+2)*(k+3)*binomial(n,k)/6, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A347056 extends Triangle {

  @Override
  public Z next() {
    return super.next().multiply(mRow + 1).multiply(mRow + 2).multiply(mCol + 3).divide(6);
  }
}
