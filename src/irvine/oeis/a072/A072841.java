package irvine.oeis.a072;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A072841 Numbers k such that the digits of k^2 are exactly the same (albeit in different order) as the digits of (k+1)^2.
 * @author Sean A. Irvine
 */
public class A072841 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      mN += 9;
      final int[] c1 = ZUtils.digitCounts(Z.valueOf(mN).square());
      final int[] c2 = ZUtils.digitCounts(Z.valueOf(mN + 1).square());
      if (Arrays.equals(c1, c2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
