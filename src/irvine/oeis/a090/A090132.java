package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090132.
 * @author Sean A. Irvine
 */
public class A090132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090132() {
    super(new long[] {-2, -2}, new long[] {1, 0});
  }
}
