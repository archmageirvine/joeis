package irvine.oeis.a160;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A160863 Expansion of (1+147*x+1142*x^2+1717*x^3+656*x^4+60*x^5+x^6)/(1-x)^7. 
 * @author Georg Fischer
 */
public class A160863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160863() {
    super(new long[] {1L, -7L, 21L, -35L, 35L, -21L, 7L}, new long[] {1L, 154L, 2199L, 13911L, 57209L, 179988L, 471675L});
  } // constructor()
} // A160863
