package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269684 Number of length-n 0..2 arrays with no repeated value differing from the previous repeated value by plus or minus one modulo 2+1.
 * @author Georg Fischer
 */
public class A269684 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269684() {
    super(1, new long[] {0, 3, -3},
      new long[] {1, -4, 3, 2});
  }
}
