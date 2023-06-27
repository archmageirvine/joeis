package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028881 a(n) = n^2 - 7.
 * @author Sean A. Irvine
 */
public class A028881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028881() {
    super(3, new long[] {1, -3, 3}, new long[] {2, 9, 18});
  }
}
