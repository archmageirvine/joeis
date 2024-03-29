package irvine.oeis.a241;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A241937 Number of length 1+4 0..n arrays with no consecutive five elements summing to more than 2*n.
 * @author Georg Fischer
 */
public class A241937 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A241937() {
    super(1, new long[] {0, 16, 0, 21, -15, 6, -1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
