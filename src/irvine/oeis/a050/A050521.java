package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050521 Number of factorizations of (n,2*n) into pairs (k,l).
 * @author Sean A. Irvine
 */
public class A050521 implements Sequence {

  private int mN = 0;
  private long[][] mCount = new long[0][0];

  // It ought to be possible to make this update more incremental.  At the moment
  // it completely rebuilds the matrix doubling the size whenever it is too small
  // for the current request.
  private void update() {
    if (mN >= mCount.length) {
      mCount = new long[2 * mN][4 * mN];
      mCount[1][1] = 1;
      for (int a = 2; a < mCount.length; ++a) {
        for (int b = 1; b < mCount[0].length; ++b) {
          for (int x = 1; x < mCount.length; ++x) {
            if (a * x < mCount.length) {
              for (int y = 1; y < mCount[0].length; ++y) {
                if (mCount[x][y] > 0 && b * y < mCount[0].length) {
                  mCount[a * x][b * y] += mCount[x][y];
                }
              }
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    update();
    return Z.valueOf(mCount[mN][2 * mN]);
  }
}
