package irvine.oeis.a196;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A196787 a(n) = 3*a(n-1) - 2*a(n-2) - a(n-4) + a(n-5) for n &gt; 5. 
 * @author Georg Fischer
 */
public class A196787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196787() {
    super(new long[] {1L, -1L, 0L, -2L, 3L}, new long[] {1L, 1L, 1L, 3L, 6L});
  } // constructor()
} // A196787
