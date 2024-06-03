package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A070194 List the phi(n) numbers from 1 to n-1 which are relatively prime to n; sequence gives size of maximal gap.
 * @author Sean A. Irvine
 */
public class A070194 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long gap = 0;
    for (long k = 2, prev = 1; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        if (k - prev > gap) {
          gap = k - prev;
        }
        prev = k;
      }
    }
    return Z.valueOf(gap);
  }
}
