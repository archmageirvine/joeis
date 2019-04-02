package irvine.oeis.a303;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A303692 a(n) = n^2*(2*n - 3 - (-1)^n)/4. 
 * @author Georg Fischer
 */
public class A303692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A303692() {
    super(new long[] {-1L, 1L, 3L, -3L, -3L, 3L, 1L}, new long[] {0L, 0L, 9L, 16L, 50L, 72L, 147L});
  } // constructor()
} // A303692
