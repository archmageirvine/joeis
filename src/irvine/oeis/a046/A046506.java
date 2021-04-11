package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A046506 Primes with multiplicative persistence value 6.
 * @author Sean A. Irvine
 */
public class A046506 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.multiplicativePersistence(p) == 6) {
        return p;
      }
    }
  }
}
