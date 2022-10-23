package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007487 Sum of 9th powers.
 * @author Sean A. Irvine
 */
public class A007487 extends Sequence0 {

  private long mN = -1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(Z.valueOf(++mN).pow(9));
    return mSum;
  }
}
