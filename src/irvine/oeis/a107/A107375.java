package irvine.oeis.a107;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A107375 a(n) = 6*a(n-1)-6*a(n-3)-a(n-4). 
 * @author Georg Fischer
 */
public class A107375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107375() {
    super(new long[] {-1L, -6L, 0L, 6L}, new long[] {0L, 1L, 1L, 2L});
  } // constructor()
} // A107375
