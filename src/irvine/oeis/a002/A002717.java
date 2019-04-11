package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002717 <code>a(n) = floor(n(n+2)(2n+1)/8)</code>.
 * @author Sean A. Irvine
 */
public class A002717 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(2)).multiply(mN.multiply2().add(1)).shiftRight(3);
  }
}

