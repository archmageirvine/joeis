package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070392 <code>a(n) = 6^n mod 11</code>.
 * @author Sean A. Irvine
 */
public class A070392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070392() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 6, 3, 7, 9, 10});
  }
}
