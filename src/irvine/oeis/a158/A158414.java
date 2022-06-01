package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158414 961n + 1.
 * @author Sean A. Irvine
 */
public class A158414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158414() {
    super(new long[] {-1, 2}, new long[] {962, 1923});
  }
}
