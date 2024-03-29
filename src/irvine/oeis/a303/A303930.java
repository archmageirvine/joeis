package irvine.oeis.a303;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A303930 Number of no-leaf subgraphs of the 2 X n grid up to horizontal and vertical reflection.
 * @author Georg Fischer
 */
public class A303930 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A303930() {
    super(1, new long[] {0, 1, -6, 4, 30, -45, -22, 60, -20},
      new long[] {1, -8, 16, 20, -95, 60, 80, -100, 25});
  }
}
