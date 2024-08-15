package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071814 Numbers k such that the number of 1's in the binary representation of k equals bigomega(k), the number of prime divisors of k (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A071814 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.i(++mN) == Long.bitCount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
