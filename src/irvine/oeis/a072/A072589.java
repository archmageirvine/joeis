package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072589 n, phi(n) and sigma(n) end with the same digit.
 * @author Sean A. Irvine
 */
public class A072589 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long r = ++mN % 10;
      if (Functions.PHI.l(mN) % 10 == r && Functions.SIGMA1.z(mN).mod(10) == r) {
        return Z.valueOf(mN);
      }
    }
  }
}
