package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014232 Primes of the form 3^k - 2.
 * @author Sean A. Irvine
 */
public class A014232 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      final Z v = mT.subtract(2);
      if (v.isProbablePrime()) {
        return v;
      }
    }
  }
}
