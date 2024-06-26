package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a090.A090368;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A117368 a(n) = largest prime less than the smallest prime dividing (2n-1).
 * @author Georg Fischer
 */
public class A117368 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A117368() {
    super(2, (term, n) -> Functions.PREV_PRIME.z(term), "", new A090368());
  }
}
