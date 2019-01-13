package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099516.
 * @author Sean A. Irvine
 */
public class A099516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099516() {
    super(new long[] {-1, 0, 2, -2, 1, 2}, new long[] {0, 1, 2, 5, 10, 23});
  }
}
