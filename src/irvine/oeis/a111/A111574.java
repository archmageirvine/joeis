package irvine.oeis.a111;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A111574 a(n) = a(n-1) + a(n-3) + a(n-4), n &gt;= 4. 
 * @author Georg Fischer
 */
public class A111574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111574() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, -1L, 2L, 3L});
  } // constructor()
} // A111574
