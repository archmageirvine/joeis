package irvine.oeis.a124;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A124848 Triangle read by rows: T(n,k) = (k+1)*(k+2)*(k+3)*binomial(n,k)/6 (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A124848 extends Triangle {

  @Override
  public Z next() {
    return super.next().multiply(mCol + 1).multiply(mCol + 2).multiply(mCol + 3).divide(6);
  }
}
