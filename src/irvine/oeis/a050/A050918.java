package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050918 Woodall primes: primes of form k*2^k-1.
 * @author Sean A. Irvine
 */
public class A050918 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).shiftLeft(mN).subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
