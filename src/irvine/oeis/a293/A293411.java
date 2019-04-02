package irvine.oeis.a293;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A293411 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 1, a(1) = 2, a(2) = 3, a(3) = 4. 
 * @author Georg Fischer
 */
public class A293411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293411() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, 2L, 3L, 4L});
  } // constructor()
} // A293411
