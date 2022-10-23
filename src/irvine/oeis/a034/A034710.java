package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A034710 Positive numbers for which the sum of digits equals the product of digits.
 * @author Sean A. Irvine
 */
public class A034710 extends Sequence1 {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitProduct(++mN) == ZUtils.digitSum(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

