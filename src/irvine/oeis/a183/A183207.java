package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183207.
 * @author Sean A. Irvine
 */
public class A183207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183207() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 9, 12, 25});
  }
}
