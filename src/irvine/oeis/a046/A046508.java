package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A046508 Primes with multiplicative persistence value 8.
 * @author Sean A. Irvine
 */
public class A046508 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.multiplicativePersistence(p) == 8) {
        return p;
      }
    }
  }
}
