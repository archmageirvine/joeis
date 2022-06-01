package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158686 64n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158686() {
    super(new long[] {1, -3, 3}, new long[] {1, 65, 257});
  }
}
