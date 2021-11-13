package irvine.oeis.a125;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A125092 Triangle read by rows: T(n,k) = (k+1)^2*binomial(n,k) (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A125092 extends Triangle {

  @Override
  public Z next() {
    return super.next().multiply(mCol + 1).multiply(mCol + 1);
  }
}
