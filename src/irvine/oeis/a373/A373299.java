package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-24/sintrif at 2024-06-24 23:40

import irvine.math.function.Functions;
import irvine.oeis.a022.A022885;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A373299 Numbers prime(k) such that prime(k) - prime(k-1) = prime(k+2) - prime(k+1).
 * @author Georg Fischer
 */
public class A373299 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A373299() {
    super(1, (term, n) -> Functions.NEXT_PRIME.z(term), "", new A022885());
  }
}
