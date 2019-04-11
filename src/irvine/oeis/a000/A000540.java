package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000540 Sum of 6th powers: <code>0^6 + 1^6 + 2^6 + ... + n^6</code>.
 * @author Sean A. Irvine
 */
public class A000540 implements Sequence {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(6));
    return mS;
  }
}
