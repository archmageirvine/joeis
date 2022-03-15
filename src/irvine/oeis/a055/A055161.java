package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055161 n has digits in descending order and n=a+b where a has the digits of n in another order and b has the digits of n in ascending order (perhaps with leading zeros).
 * @author Sean A. Irvine
 */
public class A055161 implements Sequence {

  private Z mN = Z.valueOf(494);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z desc = ZUtils.sortDigitsDescending(mN);
      if (mN.equals(desc.subtract(ZUtils.sortDigitsAscending(mN)))) {
        return desc;
      }
    }
  }
}
