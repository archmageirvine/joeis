package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158056.
 * @author Sean A. Irvine
 */
public class A158056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158056() {
    super(new long[] {1, -3, 3}, new long[] {18, 68, 150});
  }
}
