package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097924 a(n) = 4*a(n-1) + a(n-2), n&gt;=2, a(0) = 2, a(1) = 7.
 * @author Sean A. Irvine
 */
public class A097924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097924() {
    super(new long[] {1, 4}, new long[] {2, 7});
  }
}
