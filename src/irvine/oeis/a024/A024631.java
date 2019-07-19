package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024631 n written in fractional base 4/3.
 * @author Sean A. Irvine
 */
public class A024631 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n >> 2) * 3).multiply(10).add(n & 3);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

