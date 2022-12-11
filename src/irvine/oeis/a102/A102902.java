package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102902 a(n) = 9*a(n-1) - 16*a(n-2), with a(0) = 1, a(1) = 9.
 * @author Sean A. Irvine
 */
public class A102902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102902() {
    super(new long[] {-16, 9}, new long[] {1, 9});
  }
}
