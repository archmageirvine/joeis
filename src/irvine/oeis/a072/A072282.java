package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072282 Numbers n such that sigma(n) + 1 and sigma(n) - 1 are twin primes.
 * @author Sean A. Irvine
 */
public class A072282 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA.z(++mN);
      if (sigma.subtract(1).isProbablePrime() && sigma.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
