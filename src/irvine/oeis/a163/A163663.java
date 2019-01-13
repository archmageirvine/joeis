package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163663.
 * @author Sean A. Irvine
 */
public class A163663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163663() {
    super(new long[] {-1000, 110}, new long[] {0, 100});
  }
}
