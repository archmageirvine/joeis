package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001176 Number of zeros in fundamental period of Fibonacci numbers <code>mod n</code>.
 * @author Sean A. Irvine
 */
public class A001176 implements Sequence {

  private int mN = 0;

  private long findZerosInPeriod(final long n) {
    long aa = 1;
    long ab = 0;
    long k = 0;
    while (true) {
      final long s = (aa + ab) % n;
      if (s == 0) {
        ++k;
      }
      aa = ab;
      ab = s;
      if (aa == 1 && ab == 0) {
        return k;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.valueOf(findZerosInPeriod(mN));
  }
}
