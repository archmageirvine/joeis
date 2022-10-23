package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000540 Sum of 6th powers: 0^6 + 1^6 + 2^6 + ... + n^6.
 * @author Sean A. Irvine
 */
public class A000540 extends Sequence0 {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(6));
    return mS;
  }
}
