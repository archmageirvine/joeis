package irvine.oeis.a188;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188153 Number of 8-step self-avoiding walks on an n X n square summed over all starting positions.
 * @author Georg Fischer
 */
public class A188153 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A188153() {
    super(1, new long[] {0, 0, 0, 112, 1640, 2568, 648, -408, -192, -24},
      new long[] {1, -3, 3, -1});
  }
}
