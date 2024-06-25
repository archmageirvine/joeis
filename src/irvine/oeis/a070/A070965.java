package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A070965 a(1) = 1; a(n+1) = sum{k|n} a(k) * mu(k), where the sum is over the positive divisors, k, of n; and mu(k) is the Moebius function.
 * @author Sean A. Irvine
 */
public class A070965 extends CachedSequence {

  /** Construct the sequence. */
  public A070965() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : Integers.SINGLETON.sumdiv(n - 1, d -> self.a(d).multiply(Functions.MOBIUS.l(d))));
  }
}
