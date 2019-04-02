package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001846 Centered 4-dimensional orthoplex numbers (crystal ball sequence for 4-dimensional cubic lattice).
 * @author Sean A. Irvine
 */
public class A001846 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(4).multiply(mN).add(10).multiply(mN).add(8).multiply(mN).add(3).divide(3);
  }
}
