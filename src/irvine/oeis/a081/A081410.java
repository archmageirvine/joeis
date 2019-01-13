package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081410.
 * @author Sean A. Irvine
 */
public class A081410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081410() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8});
  }
}
