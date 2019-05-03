package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014232 Primes of form <code>3^m - 2</code>.
 * @author Sean A. Irvine
 */
public class A014232 implements Sequence {

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
