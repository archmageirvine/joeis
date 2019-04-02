package irvine.oeis.a302;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A302329 a(0)=1, a(1)=61; for n&gt;1, a(n) = 62*a(n-1) - a(n-2). 
 * @author Georg Fischer
 */
public class A302329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302329() {
    super(new long[] {-1L, 62L}, new long[] {1L, 61L});
  } // constructor()
} // A302329
