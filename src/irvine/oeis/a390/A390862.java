package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390862 Number of positive integers k such that at least 1/n of the integers from 1 to k are divisors of k.
 * @author Sean A. Irvine
 */
public class A390862 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= 4 * mN * mN; ++k) {
      if (Functions.SIGMA0.l(k) * mN >= k) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
