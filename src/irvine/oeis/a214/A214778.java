package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214778 a(n) = 3*a(n-1) + 6*a(n-2) + a(n-3), with a(0) = 3, a(1) = 3, and a(2) = 21.
 * @author Sean A. Irvine
 */
public class A214778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214778() {
    super(new long[] {1, 6, 3}, new long[] {3, 3, 21});
  }
}
