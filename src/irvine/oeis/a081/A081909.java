package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081909.
 * @author Sean A. Irvine
 */
public class A081909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081909() {
    super(new long[] {27, -27, 9}, new long[] {1, 3, 10});
  }
}
