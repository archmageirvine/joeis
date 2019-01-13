package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047389.
 * @author Sean A. Irvine
 */
public class A047389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047389() {
    super(new long[] {-1, 1, 1}, new long[] {3, 5, 10});
  }
}
