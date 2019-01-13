package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010025.
 * @author Sean A. Irvine
 */
public class A010025 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(8).add(15).multiply(mN).add(30).multiply(mN).add(45).multiply(mN).add(46).multiply(mN).divide(12).add(1);
  }
}
