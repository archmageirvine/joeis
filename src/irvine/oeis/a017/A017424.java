package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017424 <code>(11n+2)^12</code>.
 * @author Sean A. Irvine
 */
public class A017424 implements Sequence {

  private Z mN = Z.valueOf(-9);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(12);
  }
}

