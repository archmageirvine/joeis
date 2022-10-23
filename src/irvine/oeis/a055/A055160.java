package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055160 Numbers n with the property that n=a-b where a has the digits of n in descending order and b has the digits of n in ascending order (perhaps with leading zeros), ordered by a.
 * @author Sean A. Irvine
 */
public class A055160 extends Sequence1 {

  private Z mN = Z.valueOf(494);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(ZUtils.sortDigitsDescending(mN).subtract(ZUtils.sortDigitsAscending(mN)))) {
        return mN;
      }
    }
  }
}
