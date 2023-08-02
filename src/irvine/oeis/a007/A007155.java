package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007155 (2^(2^n))*(3^(3^n - 2^n)).
 * @author Sean A. Irvine
 */
public class A007155 extends Sequence0 {

  private int mN = -1;
  private int mT = 1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT *= 3;
    }
    return Z.THREE.pow(mT - (1L << mN)).shiftLeft(1L << mN);
  }
}
