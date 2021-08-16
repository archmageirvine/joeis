package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050523 Primes of form 7*2^n-1.
 * @author Sean A. Irvine
 */
public class A050523 implements Sequence {

  private Z mP = Z.valueOf(14);
  private long mN = -3;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (mN > 1) {
        mP = mP.shiftLeft(4);
      }
      final Z t = mP.subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
