package irvine.oeis.a181;
// manually partprom/partprod at 2022-04-12 14:12

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A181181 Product of the first n zero-free positive numbers with digital sum n.
 * @author Georg Fischer
 */
public class A181181 implements Sequence {

  private int mN = 0;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    int count = 0;
    int k = 0;
    while (count < mN) {
      ++k;
      if (String.valueOf(k).indexOf('0') < 0 && ZUtils.digitSum(k, 10) == mN) {
        ++count;
        prod = prod.multiply(k);
      }
    }
    return prod;
  }
}
