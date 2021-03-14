package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045538.
 * @author Sean A. Irvine
 */
public class A045538 implements Sequence {

  private long mN = 0;

  private boolean is(long m) {
    long prev = -1;
    while (m != 0) {
      final long r = m % 10;
      if (r == prev) {
        return true;
      }
      prev = r;
      m /= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (!is(++k * mN)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
