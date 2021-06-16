package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048404 Primes with consecutive digits that differ exactly by 7.
 * @author Sean A. Irvine
 */
public class A048404 extends A048409 {

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
