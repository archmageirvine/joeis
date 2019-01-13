package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237132.
 * @author Sean A. Irvine
 */
public class A237132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237132() {
    super(new long[] {-1, 0, 3, 0}, new long[] {3, 4, 5, 9});
  }
}
