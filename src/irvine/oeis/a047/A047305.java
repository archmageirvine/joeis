package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047305.
 * @author Sean A. Irvine
 */
public class A047305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047305() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 3, 4, 5, 6, 9});
  }
}
