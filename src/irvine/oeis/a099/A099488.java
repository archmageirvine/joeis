package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099488.
 * @author Sean A. Irvine
 */
public class A099488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099488() {
    super(new long[] {-1, 4, -2, 4}, new long[] {1, 2, 7, 28});
  }
}
