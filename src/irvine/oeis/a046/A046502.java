package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A046502 Primes with multiplicative persistence value 2.
 * @author Sean A. Irvine
 */
public class A046502 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.multiplicativePersistence(p) == 2) {
        return p;
      }
    }
  }
}
