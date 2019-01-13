package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209264.
 * @author Sean A. Irvine
 */
public class A209264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209264() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 21, 641, 6013, 30945, 112301, 324721});
  }
}
