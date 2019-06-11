package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308595 allocated for Craig Knecht.
 * @author Sean A. Irvine
 */
public class A308595 implements Sequence {

  // After Walter Trump

  private Z mSum = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ZERO;
    }
    long count = 0;
    for (int c = 1; c <= mN; ++c) {
      for (int a = c + 1; a <= mN - c; ++a) { // Type A
        for (int b = a - c + 1; b <= mN; ++b) {
          if (2 * b * c + (a - c) * (a - c) == mN) {
            ++count;
          }
        }
        for (int b = a + 1; b <= mN; ++b) { // Type B
          if ((2 * (b - a) * c + a * a) == mN) {
            ++count;
          }
        }
      }
      for (int a = c; a <= mN - c; ++a) {
        for (int b = a + 1; b <= a + c - 1; ++b) { // Type C
          if ((b * b - 2 * (b - a) * (b - c)) == mN) {
            ++count;
          }
        }
        for (int b = 1; b <= mN; ++b) { // Type D
          if ((2 * (b + a) * (b + c) - b * b) == mN) {
            ++count;
          }
        }
      }
    }
    mSum = mSum.add(count);
    return mSum;
  }
}
