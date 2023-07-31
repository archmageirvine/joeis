package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064855 a(n) = (((6^n mod 5^n) mod 4^n) mod 3^n) mod 2^n.
 * @author Sean A. Irvine
 */
public class A064855 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.SIX.modPow(Z.valueOf(++mN), Z.FIVE.pow(mN)).mod(Z.ONE.shiftLeft(2 * mN)).mod(Z.THREE.pow(mN)).mod(Z.ONE.shiftLeft(mN));
  }
}

