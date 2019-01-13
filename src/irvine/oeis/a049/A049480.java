package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049480.
 * @author Sean A. Irvine
 */
public class A049480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049480() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 10, 21});
  }
}
