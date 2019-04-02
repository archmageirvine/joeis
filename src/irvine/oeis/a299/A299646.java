package irvine.oeis.a299;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A299646 a(n) = Sum_{k = n..2*n+1} k^2. 
 * @author Georg Fischer
 */
public class A299646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A299646() {
    super(new long[] {-1L, 4L, -6L, 4L}, new long[] {1L, 14L, 54L, 135L});
  } // constructor()
} // A299646
