package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A224667 Number of 5 X 5 0..n matrices with each 2 X 2 subblock idempotent.
 * @author Georg Fischer
 */
public class A224667 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A224667() {
    super(1, new long[] {0, 196, -328, 140},
      new long[] {1, -3, 3, -1});
  }
}
