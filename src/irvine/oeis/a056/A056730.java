package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002385;

/**
 * A056730 Palindromic primes with just two distinct digits.
 * @author Sean A. Irvine
 */
public class A056730 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Integer.bitCount(ZUtils.syn(p)) == 2) {
        return p;
      }
    }
  }
}
