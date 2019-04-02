package irvine.oeis.a123;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A123222 Expansion of -x * (x-1) * (3*x^2-1) / (9*x^4-8*x^3+4*x-1). 
 * @author Georg Fischer
 */
public class A123222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123222() {
    super(new long[] {9L, -8L, 0L, 4L}, new long[] {1L, 3L, 9L, 31L});
  } // constructor()
} // A123222
