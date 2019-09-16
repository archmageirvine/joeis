package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008862 <code>a(n) = Sum_{k=0..9} C(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A008862 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(27).multiply(mN)
      .add(366).multiply(mN)
      .subtract(2646).multiply(mN)
      .add(12873).multiply(mN)
      .subtract(31563).multiply(mN)
      .add(79064).multiply(mN)
      .add(34236).multiply(mN)
      .add(270576).multiply(mN)
      .add(362880).divide(362880);
  }
}
