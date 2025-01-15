package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074213 Sum of the prime factors of k equals half the sum of the prime factors of k + 1.
 * @author Sean A. Irvine
 */
public class A074213 extends Sequence1 {

  private long mN = 89;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN).multiply2().equals(Functions.SOPF.z(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
