package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000542 Sum of 8th powers: <code>1^8 + 2^8 + ... + n^8</code>.
 * @author Sean A. Irvine
 */
public class A000542 implements Sequence {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(8));
    return mS;
  }
}
