package irvine.oeis.a164;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A164476 Number of binary strings of length n with no substrings equal to 0001, 0110, or 0111. 
 * @author Georg Fischer
 */
public class A164476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164476() {
    super(new long[] {1L, -1L, -1L, 0L, 2L}, new long[] {13L, 20L, 30L, 43L, 61L});
  } // constructor()
} // A164476
