package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152749 a(n) = (n+1)*(3*n+1)/4 for n odd, a(n) = n*(3*n+2)/4 for n even.
 * @author Sean A. Irvine
 */
public class A152749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152749() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 4, 10, 14});
  }
}
