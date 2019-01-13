package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053410.
 * @author Sean A. Irvine
 */
public class A053410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053410() {
    super(new long[] {1, -10, 0, 10}, new long[] {0, 16, 160, 1600});
  }
}
