package irvine.oeis.a199;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A199394 The number of ways to color the vertices of all (11) simple unlabeled graphs on 4 nodes using at most n colors.
 * @author Georg Fischer
 */
public class A199394 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A199394() {
    super(1, new long[] {0, -11, -35, -17, -1},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
