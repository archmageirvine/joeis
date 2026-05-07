package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a045.A045619;

/**
 * A084720 Primes p such that p+1 is a product of two or more consecutive integers.
 * @author Sean A. Irvine
 */
public class A084720 extends A045619 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
