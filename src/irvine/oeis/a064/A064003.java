package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064003 Numbers whose product of decimal digits = sum of binary digits.
 * @author Sean A. Irvine
 */
public class A064003 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitProduct(++mN) == Long.bitCount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
