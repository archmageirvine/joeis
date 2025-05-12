package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077205 a(n) = A077204(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A077205 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mT = mT.multiply(10);
    final Z v = mT.multiply(mA.mod(10)).sqrt().add(1);
    mA = v.square();
    return v;
  }
}

