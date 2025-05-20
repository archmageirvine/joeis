package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A383876 allocated for David James Sycamore.
 * @author Sean A. Irvine
 */
public class A383876 extends CachedSequence {

  /** Construct the sequence. */
  public A383876() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n == 1) {
        return Z.ONE;
      }
      final Z t = self.a(n - 1);
      boolean isRecord = true;
      int cnt = 0;
      for (int k = n - 2; k >= 0; --k) {
        final Z v = self.a(k);
        if (v.equals(t)) {
          ++cnt;
        }
        if (v.compareTo(t) >= 0) {
          isRecord = false;
        }
      }
      if (isRecord) {
        Z max = Z.ZERO;
        for (int k = n - 2; k >= 0; --k) {
          max = max.max(self.a(k));
        }
        return self.a(max);
      } else {
        return Z.valueOf(cnt);
      }
    });
  }
}
