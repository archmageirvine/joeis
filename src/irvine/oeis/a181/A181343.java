package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181343.
 * @author Sean A. Irvine
 */
public class A181343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181343() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 76, 386, 1251, 3126});
  }
}
