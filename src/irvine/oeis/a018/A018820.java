package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A018820.
 * @author Sean A. Irvine
 */
public class A018820 implements Sequence {

  // Track values of k such that n (array index) is representable as sum of k squares
  private final DynamicArray<boolean[]> mRepresentations = new DynamicArray<>();
  {
    mRepresentations.set(0, new boolean[] {true});
  }
  private int mN = 0;

  protected int lower() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final boolean[] set = new boolean[mN + 1];
      mRepresentations.set(mN, set);
      int s;
      for (int m = 1; (s = m * m) <= mN; ++m) {
        final boolean[] u = mRepresentations.get(mN - s);
        for (int k = 0; k < u.length; ++k) {
          if (u[k]) {
            set[k + 1] = true;
          }
        }
      }
      if (mN > 13 + lower()) {
        boolean ok = true;
        for (int k = lower(); k <= mN - 14; ++k) {
          if (!set[k]) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
