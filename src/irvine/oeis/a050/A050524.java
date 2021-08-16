package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050524 Primes of form 9*2^n-1.
 * @author Sean A. Irvine
 */
public class A050524 implements Sequence {

  private Z mM = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mM = mM.shiftLeft(1);
      final Z t = mM.subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
