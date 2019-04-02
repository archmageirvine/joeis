package irvine.oeis.a301;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A301647 a(n) = n^3 - (n mod 2). 
 * @author Georg Fischer
 */
public class A301647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A301647() {
    super(new long[] {-1L, 3L, -2L, -2L, 3L}, new long[] {0L, 8L, 26L, 64L, 124L});
  } // constructor()
} // A301647
