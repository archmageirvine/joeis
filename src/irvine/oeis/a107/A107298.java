package irvine.oeis.a107;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A107298 a(n) = 3*a(n-1)-a(n-2)-2*a(n-3)+a(n-4), n&gt;5. 
 * @author Georg Fischer
 */
public class A107298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107298() {
    super(new long[] {1L, -2L, -1L, 3L}, new long[] {5L, 10L, 25L, 56L}, new long[] {3L, 2L});
  } // constructor()
} // A107298
