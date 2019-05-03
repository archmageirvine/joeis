package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006885 Record highest point of trajectory before reaching 1 in <code>`3x+1'</code> problem, corresponding to starting values in <code>A006884</code>.
 * @author Sean A. Irvine
 */
public class A006885 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = A006884.max(mN);
      if (m.compareTo(mMax) > 0) {
        mMax = m;
        return mMax;
      }
    }
  }
}
