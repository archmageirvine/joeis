package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082120.
 * @author Sean A. Irvine
 */
public class A082157 extends CachedSequence {

  /** Construct the sequence. */
  public A082157() {
    super(0, Integer.class, (self, n) -> n == 0
      ? Z.ONE
      : Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n, k).multiply(Z.valueOf(k + 1).pow(2L * (n - k))).multiply(self.a(k)).multiply(Z.NEG_ONE.pow(n - k + 1))));
  }
}
