package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099505.
 * @author Sean A. Irvine
 */
public class A099505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099505() {
    super(new long[] {-1, 0, 1, -2, 1, 1}, new long[] {0, 1, 1, 2, 1, 2});
  }
}
