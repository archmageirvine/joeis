package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047281.
 * @author Sean A. Irvine
 */
public class A047281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047281() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 6, 7});
  }
}
