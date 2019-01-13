package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047370.
 * @author Sean A. Irvine
 */
public class A047370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047370() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 5, 9});
  }
}
