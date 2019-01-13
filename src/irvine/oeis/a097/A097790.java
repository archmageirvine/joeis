package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097790.
 * @author Sean A. Irvine
 */
public class A097790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097790() {
    super(new long[] {5, -21, 34, -26, 9}, new long[] {1, 9, 55, 295, 1510});
  }
}
