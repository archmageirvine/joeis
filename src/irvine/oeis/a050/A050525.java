package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050525 Primes of the form 11*2^k - 1.
 * @author Sean A. Irvine
 */
public class A050525 extends Sequence1 {

  private Z mP = Z.valueOf(44);
  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (mN > 2) {
        mP = mP.shiftLeft(4);
      }
      final Z t = mP.subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
