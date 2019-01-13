package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099471.
 * @author Sean A. Irvine
 */
public class A099471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099471() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 0, -2, -3});
  }
}
