package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A048796 Palindromic primes formed from decimal expansion of Pi written backwards then forwards.
 * @author Sean A. Irvine
 */
public class A048796 extends A000796 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    while (true) {
      if (mA.length() == 0) {
        mA.append(super.next());
      } else {
        final Z t = super.next();
        mA.insert(0, t).append(t);
      }
      final Z t = new Z(mA);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
