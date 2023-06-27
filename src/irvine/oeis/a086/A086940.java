package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086940 a(n) = k where R(k+4) = 2.
 * @author Sean A. Irvine
 */
public class A086940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086940() {
    super(1, new long[] {-10, 11}, new long[] {16, 196});
  }
}
