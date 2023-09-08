package irvine.oeis.a230;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A230780 Numbers without a prime factor congruent to 1 mod 6.
 * @author Sean A. Irvine
 */
public class A230780 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z[] primes = Jaguar.factor(mN).toZArray();
      int ip = primes.length;
      boolean busy = true;
      while (busy && --ip >= 0) {
        if (primes[ip].mod(6) == 1L) {
          busy = false;
        }
      }
      if (busy) {
        return Z.valueOf(mN);
      }
    }
  }
}
