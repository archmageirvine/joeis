package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134410.
 * @author Sean A. Irvine
 */
public class A134410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134410() {
    super(new long[] {-1, -2, 1, 2}, new long[] {6, 3, 19, 27});
  }
}
