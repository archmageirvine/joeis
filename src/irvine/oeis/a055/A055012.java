package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055012 Sum of cubes of the digits of n written in base 10.
 * @author Georg Fischer
 */
public class A055012 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long sum = 0;
    final int[] cnts = ZUtils.digitCounts(++mN);
    for (int k = 1; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        sum += k * k * k * cnts[k];
      }
    }
    return Z.valueOf(sum);
  }
}
