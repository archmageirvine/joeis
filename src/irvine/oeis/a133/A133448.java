package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133448.
 * @author Sean A. Irvine
 */
public class A133448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133448() {
    super(new long[] {3, -1, 0, 3}, new long[] {2, 5, 13, 40});
  }
}
