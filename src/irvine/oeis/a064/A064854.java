package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064854 a(n) = ((5^n mod 4^n) mod 3^n) mod 2^n.
 * @author Sean A. Irvine
 */
public class A064854 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.FIVE.modPow(Z.valueOf(++mN), Z.FOUR.pow(mN)).mod(Z.THREE.pow(mN)).mod(Z.ONE.shiftLeft(mN));
  }
}

