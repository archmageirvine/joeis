package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139744 a(n) = 11^n - 6^n.
 * @author Sean A. Irvine
 */
public class A139744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139744() {
    super(new long[] {-66, 17}, new long[] {0, 5});
  }
}
