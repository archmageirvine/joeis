package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099568.
 * @author Sean A. Irvine
 */
public class A099568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099568() {
    super(new long[] {-2, 1, -2, 3}, new long[] {1, 2, 4, 9});
  }
}
