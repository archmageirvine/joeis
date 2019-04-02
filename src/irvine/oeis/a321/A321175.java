package irvine.oeis.a321;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A321175 a(n) = -a(n-1) + 2*a(n-2) + a(n-3), a(0) = -1, a(1) = -2, a(2) = 3. 
 * @author Georg Fischer
 */
public class A321175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A321175() {
    super(new long[] {1L, 2L, -1L}, new long[] {-1L, -2L, 3L});
  } // constructor()
} // A321175
