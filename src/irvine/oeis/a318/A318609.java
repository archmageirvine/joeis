package irvine.oeis.a318;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A318609 a(1) = 2, a(2) = 4, a(3) = 6; for n &gt; 3, a(n) = 3*a(n-1) - 3*a(n-2) + 9*a(n-3). 
 * @author Georg Fischer
 */
public class A318609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A318609() {
    super(new long[] {9L, -3L, 3L}, new long[] {2L, 4L, 6L});
  } // constructor()
} // A318609
