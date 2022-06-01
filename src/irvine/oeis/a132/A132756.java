package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132756 a(n) = n*(n + 27)/2.
 * @author Sean A. Irvine
 */
public class A132756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132756() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 29});
  }
}
