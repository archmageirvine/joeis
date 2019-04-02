package irvine.oeis.a163;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A163415 a(n) = 18*a(n-1) - 79*a(n-2) for n&gt;1, a(0)=1, a(1)=13. 
 * @author Georg Fischer
 */
public class A163415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163415() {
    super(new long[] {-79L, 18L}, new long[] {1L, 13L});
  } // constructor()
} // A163415
