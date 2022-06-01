package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245804 a(n) = 2*3^n - 3*2^n.
 * @author Sean A. Irvine
 */
public class A245804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245804() {
    super(new long[] {-6, 5}, new long[] {-1, 0});
  }
}
