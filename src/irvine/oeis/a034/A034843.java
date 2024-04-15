package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034843 Number of divisors = first digit.
 * @author Sean A. Irvine
 */
public class A034843 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).longValueExact() == String.valueOf(mN).charAt(0) - '0') {
        return Z.valueOf(mN);
      }
    }
  }
}
