package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111281.
 * @author Sean A. Irvine
 */
public class A111281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111281() {
    super(new long[] {2, -2, 3}, new long[] {1, 2, 6});
  }
}
