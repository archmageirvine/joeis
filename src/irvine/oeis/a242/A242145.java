package irvine.oeis.a242;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A242145 Number of length 1+5 0..n arrays with no consecutive six elements summing to more than 3*n.
 * @author Georg Fischer
 */
public class A242145 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A242145() {
    super(1, new long[] {0, 42, 141, 175, -13, 21, -7, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
