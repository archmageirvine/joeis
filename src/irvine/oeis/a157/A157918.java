package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157918.
 * @author Sean A. Irvine
 */
public class A157918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157918() {
    super(new long[] {1, -3, 3}, new long[] {600, 2475, 5600});
  }
}
