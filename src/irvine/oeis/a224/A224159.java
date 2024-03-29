package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A224159 Number of 3 X n 0..1 arrays with diagonals and rows unimodal and antidiagonals nondecreasing.
 * @author Georg Fischer
 */
public class A224159 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A224159() {
    super(1, new long[] {0, 8, -20, 5, 40, -47, -5, 41, -27, 6},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
