package irvine.oeis.a359;
// Generated by gen_seq4.pl 2024-07-10/sintrif at 2024-07-10 23:36

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000688;
import irvine.oeis.a084.A084920;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A359421 a(n) = number of abelian groups of order p^2 - 1, where p = prime(n).
 * @author Georg Fischer
 */
public class A359421 extends SingleTransformSequence {

  private static final DirectSequence A000688 = new A000688();

  /** Construct the sequence. */
  public A359421() {
    super(1, (term, n) -> A000688.a(term), "", new A084920());
  }
}
