package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024633 n written in fractional base 5/3.
 * @author Sean A. Irvine
 */
public class A024633 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 5) * 3).multiply(10).add(n % 5);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

