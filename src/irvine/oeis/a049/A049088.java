package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a131.A131235;

/**
 * A049088 Number of n X n matrices with nonnegative integer entries and every row and column sum &lt;= 2.
 * @author Sean A. Irvine
 */
public class A049088 extends A131235 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
