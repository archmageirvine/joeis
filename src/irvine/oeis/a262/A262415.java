package irvine.oeis.a262;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A262415 Number of (n+1) X (3+1) 0..1 arrays with each row divisible by 3 and column not divisible by 3, read as a binary number with top and left being the most significant bits.
 * @author Georg Fischer
 */
public class A262415 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A262415() {
    super(1, new long[] {0, 6, 9, -54},
      new long[] {1, -6, -9, 54});
  }
}
