package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080651 Numbers n such that n and Fibonacci(n) have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A080651 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).equals(Functions.SIGMA0.z(Functions.FIBONACCI.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
