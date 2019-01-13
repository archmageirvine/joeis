package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167534.
 * @author Sean A. Irvine
 */
public class A167534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167534() {
    super(new long[] {-1, 1, 1}, new long[] {9, 70, 88});
  }
}
