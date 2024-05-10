package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068714 Primes formed from a concatenation of 2 and 3^k for some k.
 * @author Sean A. Irvine
 */
public class A068714 extends Sequence0 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      final Z t = new Z("2" + mT.toString());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
