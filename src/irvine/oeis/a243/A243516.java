package irvine.oeis.a243;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A243516 Number of length n+2 0..7 arrays with no three elements in a row with pattern aba or abb (with a!=b) and new values 0..7 introduced in 0..7 order.
 * @author Georg Fischer
 */
public class A243516 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A243516() {
    super(1, new long[] {0, 3, -46, 258, -655, 739, -288},
      new long[] {1, -17, 111, -355, 584, -468, 144});
  }
}
