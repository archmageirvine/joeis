package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a033.A033088;

/**
 * A048399 Primes with consecutive digits that differ exactly by 2.
 * @author Sean A. Irvine
 */
public class A048399 extends A033088 {

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
