package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001847 Crystal ball sequence for 5-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A001847 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(4).add(10).multiply(mN).add(40).multiply(mN).add(50).multiply(mN).add(46).multiply(mN).add(15).divide(15);
  }
}
