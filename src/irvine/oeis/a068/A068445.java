package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A068445 Palindromic pseudoprimes (base 2).
 * @author Sean A. Irvine
 */
public class A068445 extends Sequence1 {

  private final Sequence mPalindromes = new A002113().skip();

  @Override
  public Z next() {
    while (true) {
      final Z palin = mPalindromes.next();
      if (!palin.isProbablePrime() && Z.TWO.modPow(palin.subtract(1), palin).equals(Z.ONE)) {
        return palin;
      }
    }
  }
}
