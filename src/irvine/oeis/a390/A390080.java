package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392038.
 * @author Sean A. Irvine
 */
public class A390080 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long i = 0;
    long j = 0;
    long sum = 0;
    while (i < n) {
      sum += ++i * (n - i);
      while (sum > 0) {
        sum -= ++j * (j + n);
      }
      if (sum == 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

