package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168419.
 * @author Sean A. Irvine
 */
public class A168419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168419() {
    super(new long[] {-1, 1, 1}, new long[] {0, 9, 9});
  }
}
