package irvine.oeis.a298;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A298677 a(n) = 110*a(n-1) - a(n-2) for n &gt;= 2, a(0)=1, a(1)=111. 
 * @author Georg Fischer
 */
public class A298677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298677() {
    super(new long[] {-1L, 110L}, new long[] {1L, 111L});
  } // constructor()
} // A298677
