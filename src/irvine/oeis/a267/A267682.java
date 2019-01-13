package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267682.
 * @author Sean A. Irvine
 */
public class A267682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267682() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 4, 8});
  }
}
