package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068531 a(n) = (3^(2^n) - 1)/2^(n + 2).
 * @author Sean A. Irvine
 */
public class A068531 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.THREE.pow(Z.ONE.shiftLeft(++mN)).subtract(1).divide(Z.ONE.shiftLeft(mN + 2));
  }
}

