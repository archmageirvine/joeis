package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123259 A123228/2.
 * @author Sean A. Irvine
 */
public class A123259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123259() {
    super(new long[] {-1, -13, -74, -74, -13}, new long[] {3, -7, 11, 233, -3357});
  }
}
