package irvine.oeis.a085;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.a018.A018800;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A085608 Index of the smallest prime starting with n.
 * @author Georg Fischer
 */
public class A085608 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A085608() {
    super(1, (term, n) -> Functions.PRIME_PI.z(term), "", new A018800());
  }
}
