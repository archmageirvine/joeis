package irvine.oeis.a137;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137255 a(n) = 2*a(n-1) + 4*a(n-2) - 6*a(n-3) - 3*a(n-4) for n &gt; 3, with a(0)=1, a(1)=2, a(2)=4, a(3)=8.
 * @author Georg Fischer
 */
public class A137255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137255() {
    super(new long[] {-3L, -6L, 4L, 2L}, new long[] {1L, 2L, 4L, 8L});
  } // constructor()
} // A137255
