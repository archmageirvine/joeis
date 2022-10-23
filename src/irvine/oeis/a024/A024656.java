package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024656 n written in fractional base 9/8.
 * @author Sean A. Irvine
 */
public class A024656 extends Sequence0 {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 9) * 8).multiply(10).add(n % 9);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

