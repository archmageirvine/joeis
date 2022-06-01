package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056121 a(n) = n*(n + 15)/2.
 * @author Sean A. Irvine
 */
public class A056121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056121() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 17});
  }
}
