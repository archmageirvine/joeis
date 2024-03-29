package irvine.oeis.a116;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116720 Number of permutations of length n which avoid the patterns 213, 1234, 4312.
 * @author Georg Fischer
 */
public class A116720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116720() {
    super(1, new long[] {1L, -3L, 3L}, new long[] {5L, 12L, 25L}, 1L, 2L);
  } // constructor()
} // A116720
