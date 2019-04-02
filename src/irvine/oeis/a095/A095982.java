package irvine.oeis.a095;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A095982 a(n) = a(n-1) + a(n-2) + a(n-4) with a(0) = 2, a(1) = 3, a(2) = 6, a(3) = 9. 
 * @author Georg Fischer
 */
public class A095982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095982() {
    super(new long[] {1L, 0L, 1L, 1L}, new long[] {2L, 3L, 6L, 9L});
  } // constructor()
} // A095982
