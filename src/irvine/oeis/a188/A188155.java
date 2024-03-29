package irvine.oeis.a188;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188155 Number of 10-step self-avoiding walks on an n X n square summed over all starting positions.
 * @author Georg Fischer
 */
public class A188155 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A188155() {
    super(1, new long[] {0, 0, 0, 0, 3696, 14912, 15120, 3520, -2512, -1776, -392, -32},
      new long[] {1, -3, 3, -1});
  }
}
