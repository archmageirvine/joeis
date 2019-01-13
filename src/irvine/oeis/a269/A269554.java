package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269554.
 * @author Sean A. Irvine
 */
public class A269554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269554() {
    super(new long[] {1, -99, 99}, new long[] {-1, -343, -33861});
  }
}
