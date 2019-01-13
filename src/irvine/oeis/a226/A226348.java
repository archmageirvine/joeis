package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226348.
 * @author Sean A. Irvine
 */
public class A226348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226348() {
    super(new long[] {6, 5, -26, -1, 15, 2}, new long[] {1, 12, 39, 233, 1018, 5191});
  }
}
