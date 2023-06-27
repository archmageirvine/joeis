package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241219 Number of ways to choose two points on a centered hexagonal grid of size n.
 * @author Sean A. Irvine
 */
public class A241219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241219() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 21, 171, 666, 1830});
  }
}
