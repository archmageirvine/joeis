package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028569.
 * @author Sean A. Irvine
 */
public class A028569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028569() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 22});
  }
}
