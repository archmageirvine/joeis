package irvine.oeis.a137;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A137445 a(n)=2a(n-1)-2a(n-2). 
 * @author Georg Fischer
 */
public class A137445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137445() {
    super(new long[] {-2L, 2L}, new long[] {3L, 2L});
  } // constructor()
} // A137445
