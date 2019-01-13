package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182435.
 * @author Sean A. Irvine
 */
public class A182435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182435() {
    super(new long[] {1, -7, 7}, new long[] {0, 1, 4});
  }
}
