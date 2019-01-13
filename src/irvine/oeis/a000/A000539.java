package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000539.
 * @author Sean A. Irvine
 */
public class A000539 implements Sequence {

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(5));
    return mS;
  }
}
