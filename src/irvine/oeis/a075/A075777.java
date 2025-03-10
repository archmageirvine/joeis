package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075777 Minimal surface area of a rectangular solid with volume n and integer sides.
 * @author Sean A. Irvine
 */
public class A075777 extends Sequence1 {

  // After Robert Israel

  private long[] mA = {};
  private int mN = -1;

  private void step() {
    final int len = Math.max(100, 2 * mA.length);
    mA = new long[len];
    Arrays.fill(mA, 6L * len);
    for (int p1 = 1; p1 <= len; ++p1) {
      final int l1 = len / p1;
      for (int p2 = p1; p2 <= l1; ++p2) {
        for (int p3 = p2; p3 <= l1 / p2; ++p3) {
          final int n = p1 * p2 * p3 - 1;
          final long a = 2L * ((long) p1 * p2 + (long) p2 * p3 + (long) p1 * p3);
          if (a < mA[n]) {
            mA[n] = a;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= mA.length) {
      step();
    }
    return Z.valueOf(mA[mN]);
  }
}
