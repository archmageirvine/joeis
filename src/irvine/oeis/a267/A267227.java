package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A267227 Number of length-n 0..3 arrays with no following elements greater than or equal to the first repeated value.
 * @author Georg Fischer
 */
public class A267227 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A267227() {
    super(1, new long[] {0, 4, -20, 26, -2, -6},
      new long[] {1, -9, 29, -39, 18});
  }
}
