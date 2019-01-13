package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081666.
 * @author Sean A. Irvine
 */
public class A081666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081666() {
    super(new long[] {-45, 75, -44, 11}, new long[] {1, 4, 16, 62});
  }
}
