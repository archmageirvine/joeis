package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a033.A033081;

/**
 * A048400 Primes with consecutive digits that differ exactly by 3.
 * @author Sean A. Irvine
 */
public class A048400 extends A033081 {

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
