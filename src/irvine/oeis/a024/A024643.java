package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024643 n written in fractional base 7/6.
 * @author Sean A. Irvine
 */
public class A024643 extends Sequence0 {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 7) * 6).multiply(10).add(n % 7);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

