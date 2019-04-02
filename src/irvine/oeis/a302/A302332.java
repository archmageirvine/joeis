package irvine.oeis.a302;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A302332 a(0)=1, a(1)=193; for n&gt;1, a(n) = 194*a(n-1) - a(n-2). 
 * @author Georg Fischer
 */
public class A302332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302332() {
    super(new long[] {-1L, 194L}, new long[] {1L, 193L});
  } // constructor()
} // A302332
