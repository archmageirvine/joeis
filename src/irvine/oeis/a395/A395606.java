package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395606 Number of involutions (elements of order &lt;= 2) in the n-th iterated wreath product of S_3.
 * @author Sean A. Irvine
 */
public class A395606 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.pow(3).add(mA.multiply(3).multiply(Z.SIX.pow(Z.THREE.pow(mN).subtract(1).divide2())));
    }
    return mA;
  }
}
