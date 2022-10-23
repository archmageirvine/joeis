package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000542 Sum of 8th powers: 1^8 + 2^8 + ... + n^8.
 * @author Sean A. Irvine
 */
public class A000542 extends Sequence0 {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(8));
    return mS;
  }
}
