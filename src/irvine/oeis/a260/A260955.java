package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260955.
 * @author Sean A. Irvine
 */
public class A260955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260955() {
    super(new long[] {1, -3, 3}, new long[] {6, 54, 150});
  }
}
