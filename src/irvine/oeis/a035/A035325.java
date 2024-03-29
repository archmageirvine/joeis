package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035325 Primes of the form 2^k + k^2 + 1.
 * @author Sean A. Irvine
 */
public class A035325 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(++mN).add(mN * (long) mN).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

