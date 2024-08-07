package irvine.oeis.a262;
// Generated by gen_seq4.pl 2024-07-05/sintrif at 2024-07-05 23:59

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005936;
import irvine.oeis.a007.A007091;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A262102 Pseudoprimes to base 5, written in base 5.
 * @author Georg Fischer
 */
public class A262102 extends SingleTransformSequence {

  private static final DirectSequence A007091 = new A007091();

  /** Construct the sequence. */
  public A262102() {
    super(1, (term, n) -> A007091.a(term), "", new A005936());
  }
}
