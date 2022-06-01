package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016898 a(n) = (5*n + 4)^2.
 * @author Sean A. Irvine
 */
public class A016898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016898() {
    super(new long[] {1, -3, 3}, new long[] {16, 81, 196});
  }
}
