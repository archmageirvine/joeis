package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-07-11/sintrif at 2024-07-11 18:00

import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002487;
import irvine.oeis.a059.A059893;
import irvine.oeis.a180.A180200;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A245325 Numerators of an enumeration system of the reduced nonnegative rational numbers.
 * @author Georg Fischer
 */
public class A245325 extends SingleTransformSequence {

  private static final DirectSequence A002487 = new A002487();
  private static final DirectSequence A059893 = new A059893();

  /** Construct the sequence. */
  public A245325() {
    super(1, (term, n) -> A002487.a(A059893.a(term)), "", new A180200());
  }
}
