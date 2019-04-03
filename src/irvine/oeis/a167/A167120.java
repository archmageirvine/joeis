package irvine.oeis.a167;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A167120 a(n) = 20*a(n-1) - 64*a(n-2) + 1 for n &gt; 2; a(0) = 1, a(1) = 22, a(2) = 376. 
 * @author Georg Fischer
 */
public class A167120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167120() {
    super(new long[] {64L, -84L, 21L}, new long[] {22L, 376L, 6113L}, new long[] {1L});
  } // constructor()
} // A167120
