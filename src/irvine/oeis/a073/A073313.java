package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073313.
 * @author Sean A. Irvine
 */
public class A073313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073313() {
    super(new long[] {2, -4, 4}, new long[] {3, 4, 8});
  }
}
