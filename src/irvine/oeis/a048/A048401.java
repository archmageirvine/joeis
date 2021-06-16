package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048401 Primes with consecutive digits that differ exactly by 4.
 * @author Sean A. Irvine
 */
public class A048401 extends A048406 {

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
