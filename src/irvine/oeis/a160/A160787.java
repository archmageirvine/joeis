package irvine.oeis.a160;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A160787 G.f.: (21+104*x+103*x^2+23*x^3+x^4)/(1-x)^5. 
 * @author Georg Fischer
 */
public class A160787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160787() {
    super(new long[] {1L, -5L, 10L, -10L, 5L}, new long[] {21L, 209L, 938L, 2833L, 6771L});
  } // constructor()
} // A160787
