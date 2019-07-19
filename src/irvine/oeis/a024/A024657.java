package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024657 n written in fractional base 10/2.
 * @author Sean A. Irvine
 */
public class A024657 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 10) * 2).multiply(10).add(n % 10);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

