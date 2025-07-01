package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385071 a(n) = number of triangular numbers &lt;= n-th tetrahedral number.
 * @author Sean A. Irvine
 */
public class A385071 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.THREE.add(Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(12).add(9).sqrt()).divide(6);
  }
}
