package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228213 Number of second differences of arrays of length n + 2 of numbers in 0..3.
 * @author Georg Fischer
 */
public class A228213 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A228213() {
    super(1, new long[] {0, 13, 12, 60, 12, -504, -1584, -1728},
      new long[] {1, -7, 12});
  }
}
