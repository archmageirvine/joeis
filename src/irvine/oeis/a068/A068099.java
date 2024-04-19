package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A068099 a(1) = 1; a(n+1) = n! sum{k|n} a(k)/k where sum is over positive divisors k of n.
 * @author Sean A. Irvine
 */
public class A068099 extends CachedSequence {


  /** Construct the sequence. */
  public A068099() {
    super(1, Integer.class, (self, n) -> n == 1
      ? Z.ONE
      : Integers.SINGLETON.sumdiv(n - 1, d -> {
      return self.a(d).multiply(Functions.FACTORIAL.z(n - 1)).divide(d);
    }));
  }
}

