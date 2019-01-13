package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047424.
 * @author Sean A. Irvine
 */
public class A047424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047424() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 2, 3, 4, 5, 6});
  }
}
