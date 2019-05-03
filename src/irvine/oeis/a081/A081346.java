package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081346 First column in maze arrangement of natural numbers <code>A081344</code>.
 * @author Sean A. Irvine
 */
public class A081346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081346() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 9, 10, 25});
  }
}
