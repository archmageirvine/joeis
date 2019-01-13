package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047473.
 * @author Sean A. Irvine
 */
public class A047473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047473() {
    super(new long[] {-1, 1, 1}, new long[] {2, 3, 10});
  }
}
