package irvine.oeis.a234;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A234592 Number of binary words of length n which have no 0^b 1 1 0^a 1 0 1 0^b - matches, where a=b=2.
 * @author Georg Fischer
 */
public class A234592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234592() {
    super(new long[] {1L, 1L, -1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 2L}, new long[] {1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L});
  } // constructor()
} // A234592
