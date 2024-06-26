package irvine.oeis.a082;
// Generated by gen_seq4.pl 2024-05-13/multrar at 2024-05-13 22:33

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A082460 a(n) = pi(n) - a(n - 1) where pi(n) = A000720(n).
 * @author Georg Fischer
 */
public class A082460 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A082460() {
    super(1, (self, n) -> Functions.PRIME_PI.z(n).subtract(self.a(n - 1)), "0");
  }
}
