package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066949 Take the sum of the previous two terms, subtract n if this sum is greater than n.
 * @author Sean A. Irvine
 */
public class A066949 extends Sequence1 {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z t = mA.add(mB);
    mA = mB;
    if (t.compareTo(mN) > 0) {
      t = t.subtract(mN);
    }
    mB = t;
    return t;
  }
}
