package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102603 a(n) = 24*n + 21.
 * @author Sean A. Irvine
 */
public class A102603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102603() {
    super(new long[] {-1, 2}, new long[] {21, 45});
  }
}
