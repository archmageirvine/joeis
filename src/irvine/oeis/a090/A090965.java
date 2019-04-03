package irvine.oeis.a090;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A090965 a(n) = 8*a(n-1) - 4*a(n-2), where a(0) = 1, a(1) = 4. 
 * @author Georg Fischer
 */
public class A090965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090965() {
    super(new long[] {-4L, 8L}, new long[] {1L, 4L});
  } // constructor()
} // A090965
