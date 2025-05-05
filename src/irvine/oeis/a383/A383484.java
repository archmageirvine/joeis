package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077046.
 * @author Sean A. Irvine
 */
public class A383484 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z sm2 = Functions.SIGMA1.z(mN).square();
      for (long k = 1; k < mN; ++k) {
        if (sm2.add(Functions.SIGMA1.z(k).square()).equals(Z.valueOf(mN + k).square())) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

