package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024642 n written in fractional base 7/5.
 * @author Sean A. Irvine
 */
public class A024642 implements Sequence {

  private long mN = -1;

  private Z a(final long n) {
    return n < 1 ? Z.ZERO : a((n / 7) * 5).multiply(10).add(n % 7);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

