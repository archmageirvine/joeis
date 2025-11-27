package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082158 Number of deterministic completely defined acyclic automata with 3 inputs and n transient labeled states (and a unique absorbing state).
 * @author Sean A. Irvine
 */
public class A082158 extends CachedSequence {

  /** Construct the sequence. */
  public A082158() {
    super(0, Integer.class, (self, n) -> n == 0
      ? Z.ONE
      : Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n, k).multiply(Z.valueOf(k + 1).pow(3L * (n - k))).multiply(self.a(k)).multiply(Z.NEG_ONE.pow(n - k + 1))));
  }
}

