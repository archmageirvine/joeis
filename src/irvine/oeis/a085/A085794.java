package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A085794.
 * @author Sean A. Irvine
 */
public class A085794 extends Sequence0 {

  // After M. F. Hasler

  private final LongDynamicByteArray mS = new LongDynamicByteArray();
  private long mN = -1;

  private void extend(final long maxN) {
    long n = mS.length();
    while (n <= maxN) {
      if (mS.get(n) > 2) {
        mS.set(n, (byte) 0);
        if (--n < 0) {
          break;
        }
        mS.increment(n);
        continue;
      }

      boolean hasSquare = false;
      final long maxL = (n + 1) / 2;
      for (int l = 1; l <= maxL; ++l) {
        boolean match = true;
        for (int i = 0; i < l; ++i) {
          final long idx1 = n - l + 1 + i;
          final long idx2 = n - 2L * l + 1 + i;
          if (mS.get(idx1) != mS.get(idx2)) {
            match = false;
            break;
          }
        }
        if (match) {
          hasSquare = true;
          break;
        }
      }

      if (hasSquare) {
        mS.increment(n);
      } else if (++n <= maxN) {
        mS.set(n, (byte) 0);
      }
    }
    mS.truncate(maxN + 1);
  }

  @Override
  public Z next() {
    if (++mN >= mS.length()) {
      extend(2L * mN + 1);
    }
    return Z.valueOf(mS.get(mN));
  }
}
