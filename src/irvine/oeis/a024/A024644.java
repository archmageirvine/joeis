package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024644 n written in fractional base 8/2.
 * @author Sean A. Irvine
 */
public class A024644 extends Sequence0 {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n >> 3) * 2).multiply(10).add(n & 7);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

