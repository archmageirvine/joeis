package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269468 Number of length-4 0..n arrays with no repeated value equal to the previous repeated value.
 * @author Georg Fischer
 */
public class A269468 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269468() {
    super(1, new long[] {0, 10, 16, -2},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
