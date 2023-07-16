package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064510 Numbers n such that the sum of the first k divisors of n is equal to n for some k.
 * @author Sean A. Irvine
 */
public class A064510 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long sum = 0;
      for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
        sum += d.longValue();
        if (sum >= mN) {
          if (sum == mN) {
            return Z.valueOf(mN);
          }
          break;
        }
      }
    }
  }
}
