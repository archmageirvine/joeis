package irvine.oeis.a092;
// manually 2022-04-27

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A092625 Numbers with exactly three prime digits.
 * @author Georg Fischer
 */
public class A092625 implements Sequence {

  private long mN = 221;

  @Override
  public Z next() {
    while (true) {
      final int[] dc = ZUtils.digitCounts(++mN);
      if (dc[2] + dc[3] + dc[5] + dc[7] == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
