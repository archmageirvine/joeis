package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046321 Odd numbers divisible by exactly 8 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046321 extends Sequence1 {

  private long mN = 6559;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.BIG_OMEGA.l(mN) == 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
