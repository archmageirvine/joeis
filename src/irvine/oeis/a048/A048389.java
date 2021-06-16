package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048389 Primes resulting from procedure described in A048388.
 * @author Sean A. Irvine
 */
public class A048389 extends A048385 {

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
