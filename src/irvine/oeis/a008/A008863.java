package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008863.
 * @author Sean A. Irvine
 */
public class A008863 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(35).multiply(mN)
      .add(600).multiply(mN)
      .subtract(5790).multiply(mN)
      .add(36813).multiply(mN)
      .subtract(140595).multiply(mN)
      .add(408050).multiply(mN)
      .subtract(382060).multiply(mN)
      .add(1368936).multiply(mN)
      .add(2342880).multiply(mN)
      .add(3628800).divide(3628800);
  }
}

