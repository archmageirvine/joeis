package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024634 n written in fractional base 5/4.
 * @author Sean A. Irvine
 */
public class A024634 extends Sequence0 {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 5) * 4).multiply(10).add(n % 5);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

