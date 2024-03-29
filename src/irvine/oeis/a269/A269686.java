package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269686 Number of length-n 0..4 arrays with no repeated value differing from the previous repeated value by plus or minus one modulo 4+1.
 * @author Georg Fischer
 */
public class A269686 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269686() {
    super(1, new long[] {0, 5, -15, -10},
      new long[] {1, -8, 13, 12});
  }
}
