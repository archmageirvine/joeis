package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239294 a(n) = (15^n - (-3)^n)/18.
 * @author Sean A. Irvine
 */
public class A239294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239294() {
    super(new long[] {45, 12}, new long[] {0, 1});
  }
}
