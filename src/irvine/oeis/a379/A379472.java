package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-07-11.ack/sintrif at 2025-07-11 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.a057.A057889;
import irvine.oeis.a193.A193231;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A379472 Composition of Blue code and bijective bit-reverse, in this order: a(n) = A057889(A193231(n)).
 * @author Georg Fischer
 */
public class A379472 extends SingleTransformSequence {

  private static final DirectSequence A057889 = new A057889();

  /** Construct the sequence. */
  public A379472() {
    super(0, (term, n) -> A057889.a(term), "", new A193231());
  }
}
