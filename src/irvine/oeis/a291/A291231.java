package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291231.
 * @author Sean A. Irvine
 */
public class A291231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291231() {
    super(new long[] {-1, -10, -31, -20, 40, 20, -31, 10}, new long[] {10, 65, 360, 1831, 8830, 41104, 186710, 833401});
  }
}
