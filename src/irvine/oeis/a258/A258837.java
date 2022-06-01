package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258837 a(n) = 1 - n^2.
 * @author Sean A. Irvine
 */
public class A258837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258837() {
    super(new long[] {1, -3, 3}, new long[] {1, 0, -3});
  }
}
