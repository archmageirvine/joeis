package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168677.
 * @author Sean A. Irvine
 */
public class A168677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168677() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 5, 1, 1, 1, 9});
  }
}
