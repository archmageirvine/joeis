package irvine.oeis.a263;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263660 Number of length n arrays of permutations of 0..n-1 with each element moved by -2 to 2 places and with no two consecutive increases or two consecutive decreases.
 * @author Georg Fischer
 */
public class A263660 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A263660() {
    super(1, new long[] {0, 1, 2, 2, 3, 0, -2},
      new long[] {1, 0, -2});
  }
}
