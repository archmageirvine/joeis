package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052292 Primes of form 4*p^2 + 1, p prime.
 * @author Sean A. Irvine
 */
public class A052292 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().square().multiply(4).add(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
