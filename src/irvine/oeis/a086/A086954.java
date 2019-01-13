package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086954.
 * @author Sean A. Irvine
 */
public class A086954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086954() {
    super(new long[] {-4, 8, -9, 5}, new long[] {1, 1, 4, 14});
  }
}
