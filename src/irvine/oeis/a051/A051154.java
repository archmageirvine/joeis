package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051154 a(n) = 1 + 2^k + 4^k where k = 3^n.
 * @author Sean A. Irvine
 */
public class A051154 extends Sequence0 {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(3);
    return Z.ONE.shiftLeft(mT.multiply2().longValueExact()).add(Z.ONE.shiftLeft(mT.longValue())).add(1);
  }
}
