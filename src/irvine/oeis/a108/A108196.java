package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108196.
 * @author Sean A. Irvine
 */
public class A108196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108196() {
    super(new long[] {-1, 3, -8, 3}, new long[] {-1, -3, 0, 21});
  }
}
