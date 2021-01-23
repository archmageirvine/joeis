package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176916 5^n + 5n + 1.
 * @author Sean A. Irvine
 */
public class A176916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176916() {
    super(new long[] {5, -11, 7}, new long[] {2, 11, 36});
  }
}
