package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046323 Odd numbers divisible by exactly 10 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046323 extends Sequence1 {

  private long mN = 59047;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.BIG_OMEGA.l(mN) == 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
