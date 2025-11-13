package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A139250 Toothpick sequence (see Comments lines for definition).
 * @author Sean A. Irvine
 */
public class A139250 extends CachedSequence {

  private static int msb(final int n) {
    int t = 1;
    while (n >= t) {
      t <<= 1;
    }
    return t >>> 1;
  }

  /** Construct the sequence. */
  public A139250() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      final int msb = msb(n);
      final Z k = Z.valueOf(msb).square().multiply2().add(1).divide(3);
      if (msb == n) {
        return k;
      } else {
        return k.add(self.a(n - msb).multiply2()).add(self.a(n - msb + 1)).subtract(1);
      }
    });
  }
}
