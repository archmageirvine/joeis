package irvine.oeis.a179;
// Generated by gen_seq4.pl diffs/diffseq at 2023-09-23 21:26

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a005.A005153;

/**
 * A179651 Difference between consecutive practical numbers.
 * @author Georg Fischer
 */
public class A179651 extends DifferenceSequence {

  /** Construct the sequence. */
  public A179651() {
    super(1, new A005153());
  }
}
