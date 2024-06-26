package irvine.oeis.a136;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136641 a(n) is the smallest positive integer that is coprime to n and has n divisors.
 * @author Sean A. Irvine
 */
public class A136641 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long q = 0;
    while (true) {
      if (Functions.GCD.l(mN, ++q) == 1 && Functions.SIGMA0.l(q) == mN) {
        return Z.valueOf(q);
      }
    }
  }
}
