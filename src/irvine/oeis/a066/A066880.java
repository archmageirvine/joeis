package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006562.
 * @author Sean A. Irvine
 */
public class A066880 extends Sequence1 {

  private long mN = 1;
  private Z mT = null;

  @Override
  public Z next() {
    if (mT != null) {
      final Z r = mT;
      mT = null;
      return r;
    }
    final Z a = Z.ONE.shiftLeft(++mN).subtract(2);
    mT = a.add(1);
    return a;
  }
}
