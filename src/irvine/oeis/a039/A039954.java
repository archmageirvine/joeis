package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;


/**
 * A039954 Palindromic primes formed from the reflected decimal expansion of Pi.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A039954 extends A000796 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    while (true) {
      final StringBuilder r = new StringBuilder(mA).reverse();
      mA.append(super.next());
      final Z t = new Z(mA.toString() + r);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
