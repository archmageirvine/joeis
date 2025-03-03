package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075658 Numbers k such that the sum of prime divisors of k (A008472) is composite.
 * @author Sean A. Irvine
 */
public class A075658 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      if (!Functions.SOPF.z(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
