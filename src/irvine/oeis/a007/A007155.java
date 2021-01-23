package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007155 (2^(2^n))*(3^(3^n - 2^n)).
 * @author Sean A. Irvine
 */
public class A007155 implements Sequence {

  private int mN = -1;
  private int mT = 1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT *= 3;
    }
    return Z.THREE.pow(mT - (1 << mN)).shiftLeft(1 << mN);
  }
}
