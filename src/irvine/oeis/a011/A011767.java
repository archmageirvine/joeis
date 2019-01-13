package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011767.
 * @author Sean A. Irvine
 */
public class A011767 implements Sequence {

  private int mN = -2;
  private long mRes = 1;

  private boolean isSolvable(final int b, final long max) {
    // Due to symmetry can assume that 1 is always "white"
    for (long colouring = 0; colouring < 1L << max; colouring += 2) {
      if (!isSolvable(b, max, colouring)) {
        return false;
      }
    }
    return true;
  }

  private boolean isSolvable(final int b, final long max, final long colouring) {
    for (int x1 = 1; x1 < max; ++x1) {
      final long c1 = (colouring >> x1) & 1;
      for (int x2 = x1 + 1; x2 < max; ++x2) {
        if (c1 == ((colouring >> x2) & 1)) {
          final int x3 = 2 * x2 - x1 + b;
          if (x3 <= max && c1 == ((colouring >> x3) & 1)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN >= 10) {
      mRes = Math.max(mRes, 2 * mN + 10); // Lower bound in Bialostocki et al.
    }
    while (!isSolvable(mN, mRes)) {
      if (++mRes > 63) {
        throw new UnsupportedOperationException();
      }
    }
    return Z.valueOf(mRes);
  }
}
