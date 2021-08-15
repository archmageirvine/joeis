package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a003.A003277;

/**
 * A050384 Nonprimes such that n and phi(n) are relatively prime.
 * @author Sean A. Irvine
 */
public class A050384 extends A003277 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}
