package irvine.oeis.a165;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A165506 a(0) = 1, a(1) = 8, a(n) = 56*a(n-2) - a(n-1). 
 * @author Georg Fischer
 */
public class A165506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165506() {
    super(new long[] {56L, -1L}, new long[] {1L, 8L});
  } // constructor()
} // A165506
