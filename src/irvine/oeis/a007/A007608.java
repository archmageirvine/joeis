package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007608 Nonnegative integers in base -4.
 * @author Sean A. Irvine
 */
public class A007608 implements Sequence {

  private long mN = -1;

  protected int base() {
    return -4;
  }

  @Override
  public Z next() {
    long n = ++mN;
    final StringBuilder s = new StringBuilder();
    while (n >= -base() || n < 0) {
      long r = n % base();
      n /= base();
      if (r < 0) {
        ++n;
        r -= base();
      }
      s.append(r);
    }
    return new Z(String.valueOf(n) + s.reverse());
  }
}
