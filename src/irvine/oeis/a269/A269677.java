package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269677 Number of length-n 0..7 arrays with no repeated value differing from the previous repeated value by other than plus or minus one modulo 7+1.
 * @author Georg Fischer
 */
public class A269677 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269677() {
    super(1, new long[] {0, 8, -40, -64},
      new long[] {1, -13, 33, 63});
  }
}
