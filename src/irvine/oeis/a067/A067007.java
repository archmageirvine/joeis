package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067001.
 * @author Sean A. Irvine
 */
public class A067007 extends Sequence1 {

  private static final Z GOOGOL = Z.TEN.pow(100);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.TEN.modPow(GOOGOL, mN);
  }
}
