package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250362 Number of length 4 arrays x(i), i=1..4 with x(i) in i..i+n and no value appearing more than 3 times.
 * @author Georg Fischer
 */
public class A250362 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250362() {
    super(1, new long[] {0, 16, 1, 10, -2, -2, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
