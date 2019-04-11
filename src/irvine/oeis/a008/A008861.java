package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008861 Sum C(n,k), <code>k=0..8</code>.
 * @author Sean A. Irvine
 */
public class A008861 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(20).multiply(mN)
      .add(210).multiply(mN)
      .subtract(1064).multiply(mN)
      .add(3969).multiply(mN)
      .subtract(4340).multiply(mN)
      .add(15980).multiply(mN)
      .add(25584).multiply(mN)
      .add(40320).divide(40320);
  }
}
