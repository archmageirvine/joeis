package irvine.oeis.a162;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162272 a(n) = ((1+sqrt(3))*(5+sqrt(3))^n + (1-sqrt(3))*(5-sqrt(3))^n)/2.
 * @author Georg Fischer
 */
public class A162272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162272() {
    super(new long[] {-22L, 10L}, new long[] {1L, 8L});
  } // constructor()
} // A162272
