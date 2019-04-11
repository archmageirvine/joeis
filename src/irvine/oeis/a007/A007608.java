package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007608 Nonnegative integers in base <code>-4</code>.
 * @author Sean A. Irvine
 */
public class A007608 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    final StringBuilder s = new StringBuilder();
    while (n >= 4 || n < 0) {
      long r = n % -4;
      n /= -4;
      if (r < 0) {
        ++n;
        r += 4;
      }
      s.append(r);
    }
    return new Z(String.valueOf(n) + s.reverse());
  }
}
