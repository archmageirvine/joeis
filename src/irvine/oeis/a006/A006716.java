package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006716 Squares with digits 1, 4, 9.
 * @author Sean A. Irvine
 */
public class A006716 extends Sequence1 {

  private static final int TAB_SIZE = 10000; // Must be a power of 10
  private static final Z BIG = Z.valueOf(TAB_SIZE);
  private static final int[] DIGITS = {1, 4, 9};

  private Z mN = Z.ZERO;
  // Precomputed table of accepted values allows us to look at more than 1 digit at a time
  private final boolean[] mAccept = new boolean[TAB_SIZE];
  {
    for (final int a : DIGITS) {
      for (final int b : DIGITS) {
        for (final int c : DIGITS) {
          for (final int d : DIGITS) {
            mAccept[a * 1000 + b * 100 + c * 10 + d] = true;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      Z t = s;
      boolean ok = true;
      while (t.compareTo(BIG) >= 0) {
        if (!mAccept[(int) t.mod(TAB_SIZE)]) {
          ok = false;
          break;
        }
        t = t.divide(TAB_SIZE);
      }
      long u = t.longValue();
      while (u > 0) {
        final long r = u % 10;
        if (r != 1 && r != 4 && r != 9) {
          ok = false;
          break;
        }
        u /= 10;
      }
      if (ok) {
        return s;
      }
    }
  }
}
