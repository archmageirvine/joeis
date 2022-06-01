package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098850 a(n) = n*(n + 18).
 * @author Sean A. Irvine
 */
public class A098850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098850() {
    super(new long[] {1, -3, 3}, new long[] {0, 19, 40});
  }
}
