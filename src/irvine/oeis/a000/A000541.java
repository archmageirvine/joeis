package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000541 Sum of 7th powers: 1^7 + 2^7 + ... + n^7.
 * @author Sean A. Irvine
 */
public class A000541 extends Sequence0 {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(7));
    return mS;
  }
}
