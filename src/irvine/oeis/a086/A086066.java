package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A086066 a(n) = Sum_{d in D(n)} 2^d, where D(n) = set of digits of n in decimal representation.
 * @author Sean A. Irvine
 */
public class A086066 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    long sum = 0;
    for (int k = 0; k < cnts.length; ++k) {
      if (cnts[k] != 0) {
        sum += 1L << k;
      }
    }
    return Z.valueOf(sum);
  }
}

