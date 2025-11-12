package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390329 Numbers k such that the number of distinct prime divisors of binomial(2k, k) is even.
 * @author Sean A. Irvine
 */
public class A390329 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if ((Functions.OMEGA.i(Binomial.binomial(2 * ++mN, mN)) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

