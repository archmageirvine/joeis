package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099431.
 * @author Sean A. Irvine
 */
public class A099431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099431() {
    super(new long[] {-4, -4, 3, 2}, new long[] {0, 1, 0, 6});
  }
}
