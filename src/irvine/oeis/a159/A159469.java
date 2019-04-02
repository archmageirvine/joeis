package irvine.oeis.a159;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A159469 Maximum remainder when (k + 1)^n + (k - 1)^n is divided by k^2 for variable n and k &gt; 2. 
 * @author Georg Fischer
 */
public class A159469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159469() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {6L, 8L, 20L, 24L, 42L});
  } // constructor()
} // A159469
