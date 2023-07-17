package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064536 a(n) = (4^n mod 3^n) mod 2^n.
 * @author Sean A. Irvine
 */
public class A064536 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.FOUR.modPow(Z.valueOf(++mN), Z.THREE.pow(mN)).mod(Z.ONE.shiftLeft(mN));
  }
}

