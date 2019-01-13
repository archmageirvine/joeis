package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049017.
 * @author Sean A. Irvine
 */
public class A049017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049017() {
    super(new long[] {2, -7, 21, -35, 35, -21, 7}, new long[] {1, 7, 28, 84, 210, 462, 924});
  }
}
