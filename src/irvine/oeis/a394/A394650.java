package irvine.oeis.a394;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394650 allocated for Lorenzo Sauras Altuzarra.
 * @author Sean A. Irvine
 */
public class A394650 extends CachedSequence {

  /** Construct the sequence. */
  public A394650() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.valueOf(20);
      }
      return Integers.SINGLETON.sum(1, n - 2, k -> self.a(k).multiply(self.a(n - 1 - k)))
        .add(self.a(n - 1).multiply(12 * n));
    });
  }
}
