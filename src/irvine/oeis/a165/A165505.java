package irvine.oeis.a165;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A165505 a(0)=1, a(1)=7, a(n) = 42*a(n-2) - a(n-1). 
 * @author Georg Fischer
 */
public class A165505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165505() {
    super(new long[] {42L, -1L}, new long[] {1L, 7L});
  } // constructor()
} // A165505
