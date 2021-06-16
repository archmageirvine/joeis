package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048394 Primes resulting from procedure described in A048393.
 * @author Sean A. Irvine
 */
public class A048394 extends A048390 {

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
