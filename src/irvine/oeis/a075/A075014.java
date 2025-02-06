package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075014 Smallest k such that the concatenation k, k-1 is divisible by n; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A075014 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long lim = 10;
    while (true) {
      if (k++ == lim) {
        lim *= 10;
      }
      if ((k * lim + k - 1) % mN == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

