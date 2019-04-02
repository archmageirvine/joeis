package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001848 Crystal ball sequence for 6-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A001848 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(4).add(12).multiply(mN).add(70).multiply(mN).add(120).multiply(mN).add(196).multiply(mN).add(138).multiply(mN).add(45).divide(45);
  }
}
