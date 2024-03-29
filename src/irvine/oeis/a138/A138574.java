package irvine.oeis.a138;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138574 a(n) = 2*a(n-1) + 2*a(n-2) + 2*a(n-3) - a(n-4); a(0)=0, a(1)=1, a(2)=3, a(3)=9, a(4)=25.
 * @author Georg Fischer
 */
public class A138574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138574() {
    super(new long[] {-1L, 2L, 2L, 2L}, new long[] {1L, 3L, 9L, 25L}, 0L);
  } // constructor()
} // A138574
