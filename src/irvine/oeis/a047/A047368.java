package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047368.
 * @author Sean A. Irvine
 */
public class A047368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047368() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 7});
  }
}
