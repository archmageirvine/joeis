package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099508 A transform of the Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A099508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099508() {
    super(new long[] {-1, 0, 1, -2, 2, 1}, new long[] {0, 1, 1, 3, 3, 8});
  }
}
