package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055162 The number n has digits in ascending order and n=a-b where a has the digits of n in descending order and b has the digits of n in another order (a and b perhaps with extra zeros), ordered by a.
 * @author Sean A. Irvine
 */
public class A055162 extends Sequence1 {

  private Z mN = Z.valueOf(494);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z asc = ZUtils.sortDigitsAscending(mN);
      if (mN.equals(ZUtils.sortDigitsDescending(mN).subtract(asc))) {
        return asc;
      }
    }
  }
}
