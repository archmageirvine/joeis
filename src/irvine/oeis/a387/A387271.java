package irvine.oeis.a387;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A387271 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final int[][] cnts = new int[3][41]; // > log_3(2^64)
    long m = n;
    int cnt = 0;
    int prev = 0;
    while (m != 0) {
      final int r = (int) (m % 3);
      if (r == prev) {
        ++cnt;
      } else {
        ++cnts[prev][cnt];
        cnt = 1;
        prev = r;
      }
      m /= 3;
    }
    ++cnts[prev][cnt];
    return Arrays.equals(cnts[1], cnts[2]);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
