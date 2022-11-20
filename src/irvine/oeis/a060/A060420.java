package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A060420 Least decimal digit in n-th prime.
 * @author Sean A. Irvine
 */
public class A060420 extends A000040 {

  @Override
  public Z next() {
    final Z nextPrime = super.next();
    final int[] dc = ZUtils.digitCounts(nextPrime, 10);
    for (int k = 0; true; ++k) {
      if (dc[k] > 0) {
        return Z.valueOf(k);
      }
    }
  }
}
