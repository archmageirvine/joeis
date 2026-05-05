package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394739 allocated for Nicolas B\u011blohoubek.
 * @author Sean A. Irvine
 */
public class A394739 extends CachedSequence {

  /** Construct the sequence. */
  public A394739() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      long cnt = 0;
      final Z prev = self.a(n - 1);
      for (long k = 1; k < n; ++k) {
        if (self.a(k).multiply2().compareTo(prev) > 0) {
          ++cnt;
        }
      }
      return Z.valueOf(cnt);
    });
  }
}
