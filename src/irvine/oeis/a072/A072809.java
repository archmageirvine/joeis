package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A072809 Abntu sequence (Bantu alphabetized): list the numbers which have no 2's in their decimal expansion, but sort the digits of each term into alphabetical order.
 * @author Sean A. Irvine
 */
public class A072809 extends Sequence1 {

  private static final int[] BANTU_ORDERING = {8, 5, 4, 9, 1, 7, 6, 3, 0};
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN);
      if (cnts[2] == 0) {
        long v = 0;
        for (final int d : BANTU_ORDERING) {
          for (int j = 0; j < cnts[d]; ++j) {
            v *= 10;
            v += d;
          }
        }
        return Z.valueOf(v);
      }
    }
  }
}
