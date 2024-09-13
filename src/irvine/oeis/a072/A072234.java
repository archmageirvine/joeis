package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072234 Numbers k such that reverse(k) = sum of the proper divisors of k.
 * @author Sean A. Irvine
 */
public class A072234 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).subtract(mN).equals(Functions.REVERSE.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
