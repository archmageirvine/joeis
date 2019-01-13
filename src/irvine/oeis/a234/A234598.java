package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234598.
 * @author Sean A. Irvine
 */
public class A234598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234598() {
    super(new long[] {1, 3, 1, 1}, new long[] {9, 18, 35, 82});
  }
}
