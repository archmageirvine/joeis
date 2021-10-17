package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A052024 Every suffix of palindromic prime a(n) is prime (left-truncatable).
 * @author Sean A. Irvine
 */
public class A052024 extends A002385 {

  private boolean isLeftTruncatablePrime(final String s) {
    for (int k = 1; k < s.length(); ++k) {
      if (!new Z(s.substring(k)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isLeftTruncatablePrime(p.toString())) {
        return p;
      }
    }
  }
}
