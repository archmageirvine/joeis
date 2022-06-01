package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165665 a(n) = (3*2^n - 2) * 2^n.
 * @author Sean A. Irvine
 */
public class A165665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165665() {
    super(new long[] {-8, 6}, new long[] {1, 8});
  }
}
