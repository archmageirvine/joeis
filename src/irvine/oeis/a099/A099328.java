package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099328.
 * @author Sean A. Irvine
 */
public class A099328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099328() {
    super(new long[] {-1, 1, 1, 3, -1, 1, 1}, new long[] {1, 0, 1, 0, 2, 2, 8});
  }
}
