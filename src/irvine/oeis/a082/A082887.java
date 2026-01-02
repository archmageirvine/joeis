package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082887 a(n) = gcd(n! mod 2^n, (n+1)! mod 2^(n+1)).
 * @author Sean A. Irvine
 */
public class A082887 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Z t = Z.ONE.shiftLeft(mN);
    return mF.mod(t).gcd(mF.multiply(mN + 1).mod(t.multiply2()));
  }
}
