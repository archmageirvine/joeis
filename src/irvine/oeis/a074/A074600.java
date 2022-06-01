package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074600 a(n) = 2^n + 5^n.
 * @author Sean A. Irvine
 */
public class A074600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074600() {
    super(new long[] {-10, 7}, new long[] {2, 7});
  }
}
