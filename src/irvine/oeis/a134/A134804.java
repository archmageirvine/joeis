package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134804.
 * @author Sean A. Irvine
 */
public class A134804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134804() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 3, 6, 1, 6, 3, 1, 0});
  }
}
