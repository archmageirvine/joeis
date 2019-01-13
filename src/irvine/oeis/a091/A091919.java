package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091919.
 * @author Sean A. Irvine
 */
public class A091919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091919() {
    super(new long[] {2, -1, -4, 2, 2}, new long[] {1, 2, 6, 12, 27});
  }
}
