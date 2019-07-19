package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024655 n written in fractional base 9/7.
 * @author Sean A. Irvine
 */
public class A024655 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 9) * 7).multiply(10).add(n % 9);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

