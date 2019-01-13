package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099517.
 * @author Sean A. Irvine
 */
public class A099517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099517() {
    super(new long[] {-1, 0, 2, -2, 0, 2}, new long[] {1, 1, 2, 3, 6, 10});
  }
}
