package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A181178 n-th zerofree positive number with digital sum n.
 * @author Georg Fischer
 */
public class A181178 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int count = 0;
    int k = 0;
    while (count < mN) {
      ++k;
      if (String.valueOf(k).indexOf('0') < 0 && ZUtils.digitSum(k, 10) == mN) {
        ++count;
      }
    }
    return Z.valueOf(k);
  }
}
