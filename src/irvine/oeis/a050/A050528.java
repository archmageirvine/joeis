package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050528 Primes of the form 9*2^n+1.
 * @author Sean A. Irvine
 */
public class A050528 implements Sequence {

  private Z mM = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mM = mM.shiftLeft(1);
      final Z t = mM.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
