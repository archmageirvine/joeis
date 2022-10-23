package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024639 n written in fractional base 7/2.
 * @author Sean A. Irvine
 */
public class A024639 extends Sequence0 {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 7) * 2).multiply(10).add(n % 7);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

