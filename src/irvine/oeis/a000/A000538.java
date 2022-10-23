package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000538 Sum of fourth powers: 0^4 + 1^4 + ... + n^4.
 * @author Sean A. Irvine
 */
public class A000538 extends Sequence0 {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(4));
    return mS;
  }
}
