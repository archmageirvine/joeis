package irvine.oeis.a302;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A302588 a(n) = a(n-3) + 7*(n-2), a(0)=1, a(1)=2, a(2)=4. 
 * @author Georg Fischer
 */
public class A302588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302588() {
    super(new long[] {1L, -2L, 1L, -1L, 2L}, new long[] {1L, 2L, 4L, 8L, 16L});
  } // constructor()
} // A302588
