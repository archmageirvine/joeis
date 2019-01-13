package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226292.
 * @author Sean A. Irvine
 */
public class A226292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226292() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 6, 13, 22});
  }
}
