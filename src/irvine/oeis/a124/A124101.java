package irvine.oeis.a124;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A124101 Sum_(x^i*y^j*z^k) with i + j + k = m and (x, y, z) = the primitive Pythagorean triple (7, 24, 25). 
 * @author Georg Fischer
 */
public class A124101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124101() {
    super(new long[] {4200L, -943L, 56L}, new long[] {1L, 56L, 2193L});
  } // constructor()
} // A124101
