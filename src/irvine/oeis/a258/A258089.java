package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258089 a(n) = n for n = 0..3; for n&gt;3, a(n) = 4*a(n-1) + 3*a(n-2) + 2*a(n-3) + a(n-4).
 * @author Sean A. Irvine
 */
public class A258089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258089() {
    super(new long[] {1, 2, 3, 4}, new long[] {0, 1, 2, 3});
  }
}
