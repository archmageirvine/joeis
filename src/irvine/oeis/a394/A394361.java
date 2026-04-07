package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394361 Numbers k such that the values of d(k^2+1) set records, where d(k) is the number of divisors of k (A000005).
 * @author Sean A. Irvine
 */
public class A394361 extends Sequence1 {

  private Z mRecord = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Functions.SIGMA0.z(Z.valueOf(++mN).square().add(1));
      if (s0.compareTo(mRecord) > 0) {
        mRecord = s0;
        return Z.valueOf(mN);
      }
    }
  }
}
