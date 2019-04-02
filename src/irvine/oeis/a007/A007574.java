package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007574 Patterns in a dual ring.
 * @author Sean A. Irvine
 */
public class A007574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007574() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 3, 7, 15, 31, 60});
  }
}

