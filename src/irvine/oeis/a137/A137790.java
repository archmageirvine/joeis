package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137790 a(n) = 8^n-7^n-6^n-5^n-4^n-3^n-2^n.
 * @author Sean A. Irvine
 */
public class A137790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137790() {
    super(5, new long[] {40320, -69264, 48860, -18424, 4025, -511, 35}, new long[] {3761, 77325, 896849, 8869821, 81550961, 719926125, 6196609169L});
  }
}
