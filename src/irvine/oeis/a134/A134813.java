package irvine.oeis.a134;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134813 a(n) = b(n+1)-2b(n) where b() is A134812.
 * @author Georg Fischer
 */
public class A134813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134813() {
    super(new long[] {-2L, -2L}, new long[] {-3L, 3L}, 1L);
  } // constructor()
} // A134813
