package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176961 a(n) = (3*2^(n+1) - 8 - (-2)^n)/6.
 * @author Sean A. Irvine
 */
public class A176961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176961() {
    super(1, new long[] {-4, 4, 1}, new long[] {1, 2, 8});
  }
}
