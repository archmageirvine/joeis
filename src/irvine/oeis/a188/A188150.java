package irvine.oeis.a188;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188150 Number of 5-step self-avoiding walks on an n X n square summed over all starting positions.
 * @author Georg Fischer
 */
public class A188150 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A188150() {
    super(1, new long[] {0, 0, 0, 104, 120, -12, -12},
      new long[] {1, -3, 3, -1});
  }
}
