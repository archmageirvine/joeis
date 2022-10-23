package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001205 Number of clouds with n points; number of undirected 2-regular labeled graphs; or number of n X n symmetric matrices with (0,1) entries, trace 0 and all row sums 2.
 * @author Sean A. Irvine
 */
public class A001205 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.NEG_ONE;
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mC.multiply2().add(mA.multiply(mN - 1)).multiply(mN++).divide2();
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
