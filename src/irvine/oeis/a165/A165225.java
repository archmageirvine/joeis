package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165225.
 * @author Sean A. Irvine
 */
public class A165225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165225() {
    super(new long[] {-5, 10}, new long[] {1, 5});
  }
}
