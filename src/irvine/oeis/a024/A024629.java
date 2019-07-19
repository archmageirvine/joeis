package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024629 n written in fractional base 3/2.
 * @author Sean A. Irvine
 */
public class A024629 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 3) * 2).multiply(10).add(n % 3);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

