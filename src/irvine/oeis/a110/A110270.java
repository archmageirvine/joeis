package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110270 a(n) = (n mod 2)*(n mod 3).
 * @author Sean A. Irvine
 */
public class A110270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110270() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 0, 0, 2});
  }
}
