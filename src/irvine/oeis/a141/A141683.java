package irvine.oeis.a141;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A141683 b(n) = b(n-2) + b(n-3); a(n) = Sum_{k=1..n} b(k)*a(n - k). 
 * @author Georg Fischer
 */
public class A141683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141683() {
    super(new long[] {1L, 2L, 1L}, new long[] {1L, 2L, 4L}, new long[] {1L});
  } // constructor()
} // A141683
