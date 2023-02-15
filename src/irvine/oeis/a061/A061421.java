package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061421 Primes of the form 2^n+n+1.
 * @author Sean A. Irvine
 */
public class A061421 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(++mN).add(mN + 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

