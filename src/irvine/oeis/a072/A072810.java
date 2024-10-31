package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072803.
 * @author Sean A. Irvine
 */
public class A072810 extends CachedSequence {

  /** Construct the sequence. */
  public A072810() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      return self.a(n - 1).subtract(Integers.SINGLETON.sum(2, n, k -> self.a(n - k).multiply(Functions.MOBIUS.l(k))));
    });
  }
}
