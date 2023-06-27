package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176010 Positive numbers k such that k^2 == 2 (mod 97).
 * @author Sean A. Irvine
 */
public class A176010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176010() {
    super(1, new long[] {-1, 1, 1}, new long[] {14, 83, 111});
  }
}
