package irvine.oeis.a094;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A094938 a(n)=(-36^n/18)*B(2n,1/6)/B(2n,1/3) where B(n,x) is the n-th Bernoulli polynomial. 
 * @author Georg Fischer
 */
public class A094938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094938() {
    super(new long[] {-324L, 45L}, new long[] {1L, 63L});
  } // constructor()
} // A094938
