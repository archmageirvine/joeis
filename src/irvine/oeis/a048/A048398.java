package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a033.A033075;

/**
 * A048398 Primes with consecutive digits that differ exactly by 1.
 * @author Sean A. Irvine
 */
public class A048398 extends A033075 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
