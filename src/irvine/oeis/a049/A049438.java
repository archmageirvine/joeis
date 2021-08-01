package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a046.A046138;

/**
 * A049438 p, p+6 and p+8 are all primes (A046138) but p+2 is not.
 * @author Sean A. Irvine
 */
public class A049438 extends A046138 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!p.add(2).isProbablePrime()) {
        return p;
      }
    }
  }
}
