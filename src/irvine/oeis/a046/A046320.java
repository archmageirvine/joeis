package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046320 Odd numbers divisible by exactly 7 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046320 extends Sequence1 {

  private long mN = 2185;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.BIG_OMEGA.l(mN) == 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
