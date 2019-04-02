package irvine.oeis.a046;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A046877 a(n)=a(n-2)+a(n-3). 
 * @author Georg Fischer
 */
public class A046877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046877() {
    super(new long[] {1L, 1L, 0L}, new long[] {3L, 2L, 6L});
  } // constructor()
} // A046877
