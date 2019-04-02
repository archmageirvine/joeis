package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295678 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 1, a(1) = 2, a(2) = 1, a(3) = 3. 
 * @author Georg Fischer
 */
public class A295678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295678() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, 2L, 1L, 3L});
  } // constructor()
} // A295678
