package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a027.A027424;

/**
 * A062851 Number of k such that 1 &lt; k &lt; n X n and k not of the form ij for 1 &lt;= {i, j} &lt;= n.
 * @author Sean A. Irvine
 */
public class A062851 extends A027424 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().subtract(super.next());
  }
}
