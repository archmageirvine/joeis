package irvine.oeis.a317;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A317614 a(n) = (1/2)*(n^3 + n*(n mod 2)). 
 * @author Georg Fischer
 */
public class A317614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A317614() {
    super(new long[] {-1L, 2L, 1L, -4L, 1L, 2L}, new long[] {1L, 4L, 15L, 32L, 65L, 108L});
  } // constructor()
} // A317614
