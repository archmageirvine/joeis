package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A077523 Central digit of palindromic primes.
 * @author Sean A. Irvine
 */
public class A077523 extends A002385 {

  {
    super.skip(5);
    setOffset(6);
  }

  @Override
  public Z next() {
    final String s = super.next().toString();
    return Z.valueOf(s.charAt(s.length() / 2) - '0');
  }
}
