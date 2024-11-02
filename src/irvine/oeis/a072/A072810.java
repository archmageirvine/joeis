package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072810 a(0)=1, a(n) = a(n-1) - Sum_{k=2..n} mu(k) * a(n-k), where mu(k) is the Moebius function of k.
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
