package irvine.oeis.a297;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A297445 a(n) = a(n-1) + 9*a(n-2) - 9*a(n-3), where a(0) = 1, a(1) = 5, a(2) = 11. 
 * @author Georg Fischer
 */
public class A297445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A297445() {
    super(new long[] {-9L, 9L, 1L}, new long[] {1L, 5L, 11L});
  } // constructor()
} // A297445
