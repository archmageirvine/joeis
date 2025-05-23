package irvine.oeis.a304;
// Generated by gen_seq4.pl 2025-01-01.ack/rgs1 at 2025-01-01 23:25

import irvine.oeis.DirectSequence;
import irvine.oeis.a064.A064413;
import irvine.oeis.a246.A246277;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A304112 Restricted growth sequence transform of A246277(A064413(n)), related to indices in the prime factorization of EKG sequence.
 * @author Georg Fischer
 */
public class A304112 extends RestrictedGrowthTransformSequence {

  private static final DirectSequence A246277 = new A246277();

  /** Construct the sequence. */
  public A304112() {
    super(1, new SingleTransformSequence(1, (term, n) -> A246277.a(term), "", new A064413()));
  }
}
