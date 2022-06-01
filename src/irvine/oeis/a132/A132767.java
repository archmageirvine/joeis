package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132767 a(n) = n*(n + 25).
 * @author Sean A. Irvine
 */
public class A132767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132767() {
    super(new long[] {1, -3, 3}, new long[] {0, 26, 54});
  }
}
