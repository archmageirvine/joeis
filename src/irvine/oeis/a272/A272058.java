package irvine.oeis.a272;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A272058 Start with all terms set to 0. Then add n to the next n+3 terms for n=0,1,2,... . 
 * @author Georg Fischer
 */
public class A272058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272058() {
    super(new long[] {0L, 0L, 1L, -1L, -2L, 2L, 1L}, new long[] {0L, 0L, 1L, 3L, 6L, 10L, 14L});
  } // constructor()
} // A272058
