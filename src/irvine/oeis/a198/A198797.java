package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198797 4*6^n-1.
 * @author Sean A. Irvine
 */
public class A198797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198797() {
    super(new long[] {-6, 7}, new long[] {3, 23});
  }
}
