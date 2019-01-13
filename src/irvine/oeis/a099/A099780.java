package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099780.
 * @author Sean A. Irvine
 */
public class A099780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099780() {
    super(new long[] {2, -9, 6}, new long[] {1, 3, 9});
  }
}
