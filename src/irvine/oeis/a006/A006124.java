package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006124.
 * @author Sean A. Irvine
 */
public class A006124 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(7).add(1).multiply(mN).add(6).divide2();
  }
}
