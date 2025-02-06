package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075040 a(1) = 0; a(n) = smallest of three consecutive numbers all with 2n divisors.
 * @author Sean A. Irvine
 */
public class A075040 extends Sequence1 {

  // Only good for a few terms

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 2) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      if (Functions.SIGMA0.z(++k).equals(mN) && Functions.SIGMA0.z(k + 1).equals(mN) && Functions.SIGMA0.z(k + 2).equals(mN)) {
        return Z.valueOf(k);
      }
    }
  }
}

