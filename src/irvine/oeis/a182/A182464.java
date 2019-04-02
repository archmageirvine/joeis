package irvine.oeis.a182;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A182464 a(n) = 3a(n-1) - 2a(n-2) with a(0)=24 and a(1)=60. 
 * @author Georg Fischer
 */
public class A182464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182464() {
    super(new long[] {-2L, 3L}, new long[] {24L, 60L});
  } // constructor()
} // A182464
