package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003482.
 * @author Sean A. Irvine
 */
public class A003482 implements Sequence {

  private Z mA = Z.valueOf(-3);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(7).subtract(mA).add(4);
    mA = mB;
    mB = t;
    return mB;
  }
}

