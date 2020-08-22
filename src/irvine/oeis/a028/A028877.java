package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028877 Primes of form k^2 - 5.
 * @author Sean A. Irvine
 */
public class A028877 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(5);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
