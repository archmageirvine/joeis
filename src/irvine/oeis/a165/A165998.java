package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165998.
 * @author Sean A. Irvine
 */
public class A165998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165998() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 6, 3, 12});
  }
}
