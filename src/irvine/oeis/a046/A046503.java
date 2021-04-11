package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A046503 Primes with multiplicative persistence value 3.
 * @author Sean A. Irvine
 */
public class A046503 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (ZUtils.multiplicativePersistence(p) == 3) {
        return p;
      }
    }
  }
}
