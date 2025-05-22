package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A383876 a(0) = 0, a(1) = 1. Let n be greatest index such that a(0),...a(n) are already known. If a(n) is not a record term, a(n+1) = number of k &lt; n such that a(k) = a(n). If a(n) is a record term a(n+1) = a(r) where r is the greatest record &lt; a(n).
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
