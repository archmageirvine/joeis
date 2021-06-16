package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048405 Primes with consecutive digits that differ exactly by 8.
 * @author Sean A. Irvine
 */
public class A048405 extends A048410 {

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
