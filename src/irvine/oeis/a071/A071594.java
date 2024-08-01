package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071594 Numbers k such that the number of 1's in the binary representation of k equals omega(k), the number of distinct primes in the factorization of k.
 * @author Sean A. Irvine
 */
public class A071594 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Long.bitCount(++mN) == Functions.OMEGA.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

