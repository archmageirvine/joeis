package irvine.oeis.a072;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A072110 a(n) = 4*a(n-1) - a(n-2) - 2, with a(0)=1, a(1)=2. 
 * @author Georg Fischer
 */
public class A072110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072110() {
    super(new long[] {1L, -5L, 5L}, new long[] {1L, 2L, 5L});
  } // constructor()
} // A072110
