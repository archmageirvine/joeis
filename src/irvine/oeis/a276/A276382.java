package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276382.
 * @author Sean A. Irvine
 */
public class A276382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276382() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 5, 10, 17});
  }
}
