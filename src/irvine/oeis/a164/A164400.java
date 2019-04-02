package irvine.oeis.a164;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A164400 Number of binary strings of length n with no substrings equal to 0001 or 1100. 
 * @author Georg Fischer
 */
public class A164400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164400() {
    super(new long[] {1L, -2L, 0L, 0L, 2L}, new long[] {14L, 24L, 41L, 70L, 120L});
  } // constructor()
} // A164400
