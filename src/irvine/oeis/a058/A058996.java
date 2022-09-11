package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A058996 Primes whose reversal is a fourth power.
 * @author Sean A. Irvine
 */
public class A058996 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z rev = ZUtils.reverse(p);
      rev.root(4);
      if (rev.auxiliary() == 1) {
        return p;
      }
    }
  }
}
