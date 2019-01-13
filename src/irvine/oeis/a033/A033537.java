package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033537.
 * @author Sean A. Irvine
 */
public class A033537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033537() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 18});
  }
}
