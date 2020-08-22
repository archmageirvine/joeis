package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028886 Primes of the form k^2 - 8.
 * @author Sean A. Irvine
 */
public class A028886 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(8);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
