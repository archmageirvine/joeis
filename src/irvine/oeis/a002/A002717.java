package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002717 a(n) = floor(n(n+2)(2n+1)/8).
 * @author Sean A. Irvine
 */
public class A002717 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(2)).multiply(mN.multiply2().add(1)).shiftRight(3);
  }
}

