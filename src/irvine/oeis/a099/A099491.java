package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099491.
 * @author Sean A. Irvine
 */
public class A099491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099491() {
    super(new long[] {-1, 0, -2, 1, -2, 0}, new long[] {1, 0, 0, 1, -1, -2});
  }
}
