package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099099.
 * @author Sean A. Irvine
 */
public class A099099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099099() {
    super(new long[] {-1, 5, -6, 4}, new long[] {1, 1, 1, 2});
  }
}
