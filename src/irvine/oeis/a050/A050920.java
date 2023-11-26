package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050920 Cullen primes: primes of the form n*2^n+1.
 * @author Sean A. Irvine
 */
public class A050920 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).shiftLeft(mN).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
