package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099942 Start with 1, then alternately double or add 2.
 * @author Sean A. Irvine
 */
public class A099942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099942() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 4, 8});
  }
}
