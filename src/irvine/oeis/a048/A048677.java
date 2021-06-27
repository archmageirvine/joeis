package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A048677 Concatenation of first n palindromic primes.
 * @author Sean A. Irvine
 */
public class A048677 extends A002385 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}

