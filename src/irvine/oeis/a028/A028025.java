package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028025.
 * @author Sean A. Irvine
 */
public class A028025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028025() {
    super(new long[] {-360, 342, -119, 18}, new long[] {1, 18, 205, 1890});
  }
}
