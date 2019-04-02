package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176010 Positive numbers n such that n^2=2 mod(97).
 * @author Sean A. Irvine
 */
public class A176010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176010() {
    super(new long[] {-1, 1, 1}, new long[] {14, 83, 111});
  }
}
