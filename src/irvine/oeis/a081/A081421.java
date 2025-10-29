package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A081421 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.FIVE.pow(mN).add(Z.THREE.pow(mN)).divide2();
  }
}
