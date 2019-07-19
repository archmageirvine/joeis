package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024636 n written in fractional base 6/3.
 * @author Sean A. Irvine
 */
public class A024636 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 6) * 3).multiply(10).add(n % 6);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

