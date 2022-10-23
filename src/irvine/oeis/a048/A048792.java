package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A048792 When cubed gives number composed just of the digits 0, 1, 2, 3, 4.
 * @author Sean A. Irvine
 */
public class A048792 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    outer:
    while (true) {
      final int[] cnts = ZUtils.digitCounts(Z.valueOf(++mN).pow(3));
      for (int k = 5; k < cnts.length; ++k) {
        if (cnts[k] > 0) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
