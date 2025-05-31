package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018804;

/**
 * A384020 Numbers k &gt; 0 such that sigma(A018804(k)) = k*tau(A018804(k)) where sigma denotes the sum of divisors (A000203) and tau denotes the number of divisors (A000005).
 * @author Sean A. Irvine
 */
public class A384020 extends Sequence1 {

  private final Sequence mPillai = new A018804();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z pillai = mPillai.next();
      if (Functions.SIGMA1.z(pillai).equals(Functions.SIGMA0.z(pillai).multiply(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
