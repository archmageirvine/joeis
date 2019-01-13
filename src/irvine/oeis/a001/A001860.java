package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001860.
 * @author Sean A. Irvine
 */
public class A001860 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(8).add(27).multiply(mN).add(21).multiply(mN).add(9).divide(18);
  }
}
