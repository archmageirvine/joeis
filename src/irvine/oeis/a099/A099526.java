package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099526 Expansion of 1/(1-2x-3x^4).
 * @author Sean A. Irvine
 */
public class A099526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099526() {
    super(new long[] {3, 0, 0, 2}, new long[] {1, 2, 4, 8});
  }
}
