package irvine.oeis.a222;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A222939 Number of n X 1 0..4 arrays with no element equal to another at a city block distance of exactly two, and new values 0..4 introduced in row major order.
 * @author Georg Fischer
 */
public class A222939 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A222939() {
    super(1, new long[] {0, 1, -5, 3, 6, -3},
      new long[] {1, -7, 14, -8});
  }
}
