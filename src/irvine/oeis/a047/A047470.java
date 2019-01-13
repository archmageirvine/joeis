package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047470.
 * @author Sean A. Irvine
 */
public class A047470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047470() {
    super(new long[] {-1, 1, 1}, new long[] {0, 3, 8});
  }
}
