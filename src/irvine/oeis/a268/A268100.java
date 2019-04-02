package irvine.oeis.a268;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A268100 a(n) = 2^(n mod 2)*5*10^floor(n/2). 
 * @author Georg Fischer
 */
public class A268100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268100() {
    super(new long[] {10L, 0L}, new long[] {10L, 50L});
  } // constructor()
} // A268100
