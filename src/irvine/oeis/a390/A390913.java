package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390913 Largest positive integer k such that exactly 1/n of the integers from 1 to k are divisors of k, or 0 if no solution exists.
 * @author Sean A. Irvine
 */
public class A390913 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 4 * mN * mN; k > 0; --k) {
      if (Functions.SIGMA0.l(k) * mN == k) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}
