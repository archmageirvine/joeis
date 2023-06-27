package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260937 Indices i of pentagonal numbers P(i) such that (P(i)-1)/2 is also a pentagonal number.
 * @author Sean A. Irvine
 */
public class A260937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260937() {
    super(1, new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 106, 345, 122130, 397937});
  }
}
