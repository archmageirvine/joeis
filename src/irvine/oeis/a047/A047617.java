package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047617.
 * @author Sean A. Irvine
 */
public class A047617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047617() {
    super(new long[] {-1, 1, 1}, new long[] {2, 5, 10});
  }
}
