package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183897 Number of nondecreasing arrangements of n+3 numbers in 0..2 with each number being the sum mod 3 of three others.
 * @author Georg Fischer
 */
public class A183897 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A183897() {
    super(1, new long[] {0, 1, 4, -1, -6, 3},
      new long[] {1, -3, 3, -1});
  }
}
