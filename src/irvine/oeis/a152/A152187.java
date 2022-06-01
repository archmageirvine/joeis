package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152187 a(n) = 3*a(n-1) + 5*a(n-2), with a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A152187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152187() {
    super(new long[] {5, 3}, new long[] {1, 5});
  }
}
