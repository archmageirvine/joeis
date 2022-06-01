package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079935 a(n) = 4*a(n-1) - a(n-2) with a(1) = 1, a(2) = 3.
 * @author Sean A. Irvine
 */
public class A079935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079935() {
    super(new long[] {-1, 4}, new long[] {1, 3});
  }
}
