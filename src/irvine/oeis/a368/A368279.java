package irvine.oeis.a368;
// Generated by gen_seq4.pl diffs/diffseq at 2024-02-27 21:31

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a007.A007059;

/**
 * A368279 a(n) is the number of compositions of n where the first part is the largest part and the last part is not 1. Row sums of A368579.
 * @author Georg Fischer
 */
public class A368279 extends DifferenceSequence {

  /** Construct the sequence. */
  public A368279() {
    super(0, new A007059());
  }
}
