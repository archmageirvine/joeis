package irvine.oeis.a256;
// Generated by gen_seq4.pl 2024-07-26/sintrif at 2024-07-27 00:11

import irvine.math.function.Functions;
import irvine.oeis.a071.A071394;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A256394 Prime values of pi(n) that divide n.
 * @author Georg Fischer
 */
public class A256394 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A256394() {
    super(1, (term, n) -> Functions.PRIME_PI.z(term), "", new A071394());
  }
}
