package irvine.oeis.a316;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A316631 Expansion of A(x) = x*(1+3*x^2+x^3+3*x^4+x^6)/(1-x^4)^2. 
 * @author Georg Fischer
 */
public class A316631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316631() {
    super(new long[] {-1L, 0L, 0L, 0L, 2L, 0L, 0L, 0L}, new long[] {0L, 1L, 0L, 3L, 1L, 5L, 0L, 7L});
  } // constructor()
} // A316631
