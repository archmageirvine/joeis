package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a035.A035348;

/**
 * A049055 Triangle read by rows, giving T(n,k) = number of k-member minimal ordered covers of a labeled n-set (1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A049055 extends A035348 {

  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mM));
  }
}
