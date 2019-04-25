package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008859 <code>a(n) = Sum_{k=0..6} C(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A008859 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(9).multiply(mN)
      .add(55).multiply(mN)
      .subtract(75).multiply(mN)
      .add(304).multiply(mN)
      .add(444).multiply(mN)
      .add(720).divide(720);
  }
}

