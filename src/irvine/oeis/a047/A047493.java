package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047493.
 * @author Sean A. Irvine
 */
public class A047493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047493() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 5, 7, 9});
  }
}
