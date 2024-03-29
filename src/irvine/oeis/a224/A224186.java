package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A224186 Number of n X 4 0..2 arrays with rows unimodal and columns nondecreasing.
 * @author Georg Fischer
 */
public class A224186 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A224186() {
    super(1, new long[] {0, 46, 134, 250, -91, 127, -84, 36, -9, 1},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
