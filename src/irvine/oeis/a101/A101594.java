package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A101594 Numbers with exactly two distinct decimal digits, neither of which is 0.
 * @author Georg Fischer
 */
public class A101594 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final int[] counts = ZUtils.digitCounts(n);
      if (counts[0] == 0) {
        int num = 0;
        int i = counts.length - 1;
        while (i >= 1 && num <= 2) {
          if (counts[i] != 0) {
            ++num;
          }
          --i;
        }
        if (num == 2) {
          return n;
        }
      }
    }
  }
}
