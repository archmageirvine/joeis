package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137531.
 * @author Sean A. Irvine
 */
public class A137531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137531() {
    super(new long[] {1, -2, 3}, new long[] {1, 4, 10});
  }
}
