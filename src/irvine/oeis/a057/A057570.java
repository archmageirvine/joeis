package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057570.
 * @author Sean A. Irvine
 */
public class A057570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057570() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 4, 13, 15});
  }
}
