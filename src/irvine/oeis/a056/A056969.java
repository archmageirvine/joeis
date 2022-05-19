package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056969 a(n) = 10^n modulo n.
 * @author Sean A. Irvine
 */
public class A056969 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.TEN.modPow(mN, mN);
  }
}
