package irvine.oeis.a136;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136336 a(n) = a(n-1) + 4*a(n-2) - 4*a(n-3) for n&gt;3.
 * @author Georg Fischer
 */
public class A136336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136336() {
    super(new long[] {-4L, 4L, 1L}, new long[] {2L, 4L, 7L}, 1L);
  } // constructor()
} // A136336
