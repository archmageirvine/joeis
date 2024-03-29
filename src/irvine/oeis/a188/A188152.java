package irvine.oeis.a188;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188152 Number of 7-step self-avoiding walks on an n X n square summed over all starting positions.
 * @author Georg Fischer
 */
public class A188152 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A188152() {
    super(1, new long[] {0, 0, 0, 112, 912, 744, -72, -116, -20},
      new long[] {1, -3, 3, -1});
  }
}
