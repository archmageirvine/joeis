package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002385;

/**
 * A030286 Palindromic primes whose digits do not appear in previous term.
 * @author Sean A. Irvine
 */
public class A030286 extends A002385 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final int syndrome = ZUtils.syn(mA);
    do {
      mA = super.next();
    } while ((ZUtils.syn(mA) & syndrome) != 0);
    return mA;
  }
}
