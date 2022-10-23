package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056969 a(n) = 10^n modulo n.
 * @author Sean A. Irvine
 */
public class A056969 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.TEN.modPow(mN, mN);
  }
}
