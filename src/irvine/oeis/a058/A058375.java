package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A058375 Palindromic primes with just two distinct prime digits.
 * @author Sean A. Irvine
 */
public class A058375 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int syn = Functions.SYNDROME.i(p);
      if ((syn & 0b1101010011) == 0 && Integer.bitCount(syn) == 2) {
        return p;
      }
    }
  }
}
