package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004538.
 * @author Sean A. Irvine
 */
public class A004538 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).add(3).multiply(mN).subtract(1);
  }
}
