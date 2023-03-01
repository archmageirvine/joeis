package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061983 3^n - (3n^2 + n + 2)/2.
 * @author Georg Fischer
 */
public class A061983 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow(mN).subtract(Z.valueOf((3 * mN * mN + mN + 2) / 2));
  }
}
