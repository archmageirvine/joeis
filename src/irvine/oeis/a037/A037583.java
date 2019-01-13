package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037583.
 * @author Sean A. Irvine
 */
public class A037583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037583() {
    super(new long[] {-4, 1, 4}, new long[] {3, 13, 55});
  }
}
