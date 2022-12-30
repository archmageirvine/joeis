package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120689 a(n) = 10*a(n-1) - 16*a(n-2), with a(0) = 0 and a(1) = 3.
 * @author Sean A. Irvine
 */
public class A120689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120689() {
    super(new long[] {-16, 10}, new long[] {0, 3});
  }
}
