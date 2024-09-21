package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072281 Numbers n such that phi(n) + 1 and phi(n) - 1 are twin primes.
 * @author Sean A. Irvine
 */
public class A072281 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      if (phi.subtract(1).isProbablePrime() && phi.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
