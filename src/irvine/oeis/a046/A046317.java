package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046317 Odd numbers divisible by exactly 4 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046317 extends Sequence1 {

  private long mN = 79;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.BIG_OMEGA.l(mN) == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
