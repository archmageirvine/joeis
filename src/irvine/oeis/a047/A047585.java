package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047585.
 * @author Sean A. Irvine
 */
public class A047585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047585() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 1, 3, 5, 6, 7});
  }
}
