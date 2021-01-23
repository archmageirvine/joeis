package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000538 Sum of fourth powers: 0^4 + 1^4 + ... + n^4.
 * @author Sean A. Irvine
 */
public class A000538 implements Sequence {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(4));
    return mS;
  }
}
