package irvine.oeis.a163;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163068 a(n) = 16*a(n-1) - 59*a(n-2) for n &gt; 1; a(0) = 2, a(1) = 21. 
 * @author Georg Fischer
 */
public class A163068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163068() {
    super(new long[] {-59L, 16L}, new long[] {2L, 21L});
  } // constructor()
} // A163068
