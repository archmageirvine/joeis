package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208598 Number of 4-bead necklaces labeled with numbers -n..n not allowing reversal, with sum zero.
 * @author Georg Fischer
 */
public class A208598 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A208598() {
    super(1, new long[] {0, 6, -1, 4, -1},
      new long[] {1, -4, 6, -4, 1});
  }
}
