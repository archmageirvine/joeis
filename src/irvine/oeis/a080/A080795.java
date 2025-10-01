package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080795 Number of minimax trees on n nodes.
 * @author Sean A. Irvine
 */
public class A080795 extends CachedSequence {

  /** Construct the sequence. */
  public A080795() {
    super(0, Integer.class, (self, n) -> n <= 1 ? Z.ONE : Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n - 1, k).multiply(self.a(k)).multiply(self.a(n - 1 - k))).multiply2());
  }
}

