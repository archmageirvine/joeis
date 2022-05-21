package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A057104 The non-octal numbers: numbers containing an 8 or 9 (they cannot be mistaken for octal numbers).
 * @author Sean A. Irvine
 */
public class A057104 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final int[] d = ZUtils.digitCounts(++mN);
      if (d[8] > 0 || d[9] > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
