package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036347 Numbers k for which the parity of k and the parity of sopfr(k) differ, where sopfr is the sum of prime factors with repetition.
 * @author Sean A. Irvine
 */
public class A036347 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sum = Jaguar.factor(++mN).sopfr();
      if ((mN & 1) != (sum.longValue() & 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
