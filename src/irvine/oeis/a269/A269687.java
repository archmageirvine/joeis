package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269687 Number of length-n 0..5 arrays with no repeated value differing from the previous repeated value by plus or minus one modulo 5+1.
 * @author Georg Fischer
 */
public class A269687 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269687() {
    super(1, new long[] {0, 6, -24, -18},
      new long[] {1, -10, 21, 20});
  }
}
