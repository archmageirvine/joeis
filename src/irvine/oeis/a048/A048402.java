package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048402 Primes with consecutive digits that differ exactly by 5.
 * @author Sean A. Irvine
 */
public class A048402 extends A048407 {

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
