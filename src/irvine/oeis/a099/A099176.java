package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099176.
 * @author Sean A. Irvine
 */
public class A099176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099176() {
    super(new long[] {-4, -4, 4, 2}, new long[] {1, 1, 4, 8});
  }
}
