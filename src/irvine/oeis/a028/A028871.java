package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028871 Primes of the form k^2 - 2.
 * @author Sean A. Irvine
 */
public class A028871 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(2);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
