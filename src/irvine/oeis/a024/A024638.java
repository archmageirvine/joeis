package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024638 n written in fractional base 6/5.
 * @author Sean A. Irvine
 */
public class A024638 extends Sequence0 {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 6) * 5).multiply(10).add(n % 6);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

