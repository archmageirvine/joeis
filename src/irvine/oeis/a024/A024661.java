package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024661 n written in fractional base 10/6.
 * @author Sean A. Irvine
 */
public class A024661 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 10) * 6).multiply(10).add(n % 10);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

