package irvine.oeis.a125;
// Generated by gen_seq4.pl diffs/diffseq at 2023-09-23 21:26

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a005.A005101;

/**
 * A125115 Differences between consecutive abundant numbers.
 * @author Georg Fischer
 */
public class A125115 extends DifferenceSequence {

  /** Construct the sequence. */
  public A125115() {
    super(1, new A005101());
  }
}
