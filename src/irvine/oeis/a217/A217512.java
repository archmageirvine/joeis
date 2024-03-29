package irvine.oeis.a217;
// Generated by gen_seq4.pl 2024-03-18/partsun at 2024-03-19 22:50

import irvine.oeis.FilterSequence;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005925;

/**
 * A217512 Partial sums of nonzero terms in A005925.
 * @author Georg Fischer
 */
public class A217512 extends PartialSumSequence {

  /** Construct the sequence. */
  public A217512() {
    super(0, new FilterSequence(0, new A005925(), FilterSequence.NONZERO));
  }
}
