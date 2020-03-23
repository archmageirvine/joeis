package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A030150 Palindromic primes in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030150 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030141.isOk(p)) {
        return p;
      }
    }
  }
}
