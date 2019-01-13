package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265382.
 * @author Sean A. Irvine
 */
public class A265382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265382() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 8, 13, 20});
  }
}
