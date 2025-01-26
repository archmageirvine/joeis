package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074751 Numbers n such that the sum of the anti-divisors of n (excluding 1) = sum of proper divisors (or aliquot parts) of n.
 * @author Sean A. Irvine
 */
public class A074751 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.ALIQUOT.z(++mN).equals(Functions.ANTISIGMA1.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
