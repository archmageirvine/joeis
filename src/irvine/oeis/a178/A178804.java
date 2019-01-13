package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178804.
 * @author Sean A. Irvine
 */
public class A178804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178804() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 1, 1, 2, 2, 3});
  }
}
