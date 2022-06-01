package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132754 a(n) = n*(n + 23)/2.
 * @author Sean A. Irvine
 */
public class A132754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132754() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 25});
  }
}
