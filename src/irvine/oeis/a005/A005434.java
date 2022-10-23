package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A005434 Number of distinct autocorrelations of binary words of length n.
 * @author Sean A. Irvine
 */
public class A005434 extends Sequence1 {

  // After T. Sillke

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final DynamicLongArray count = new DynamicLongArray();
    final DynamicLongArray d = new DynamicLongArray();
    final DynamicLongArray j = new DynamicLongArray();
    int h = 0;
    int n = 0;
    while (true) {
      ++h;
      d.set(h, 1L);
      j.set(h, ++n);
      count.set(n, count.get(n) + 1);
      valid:
      while (n < mN) {
        if (h > 2) {
          int k = h - 2;
          do {
            if (j.get(k) == n && (d.get(k + 1) == 1 || d.get(k) % d.get(k + 1) == 0)) {
              break valid;
            }
          } while (--k > 0);
        }
        j.set(h, j.get(h) + 2);
        d.set(h, d.get(h) + 1);
        ++n;
        for (int k = h - 1; k > 0; --k) {
          if (j.get(k) == n - 2) {
            break valid;
          }
        }
        count.set(n, count.get(n) + 1);
      }
      do {
        while (j.get(h) == n--) {
          if (--h == 0) {
            return Z.valueOf(count.get(mN));
          }
        }
        j.set(h, j.get(h) - 2);
        d.set(h, d.get(h) - 1);
      } while (j.get(h - 1) == n && d.get(h) == 1);
    }
  }
}
