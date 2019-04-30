package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178875 Partial sums of <code>round(4^n/9)</code>.
 * @author Sean A. Irvine
 */
public class A178875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178875() {
    super(new long[] {4, -5, 1, -4, 5}, new long[] {0, 0, 2, 9, 37});
  }
}
