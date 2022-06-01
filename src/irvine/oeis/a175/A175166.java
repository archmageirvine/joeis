package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175166 a(n) = 64*(2^n - 1).
 * @author Sean A. Irvine
 */
public class A175166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175166() {
    super(new long[] {-2, 3}, new long[] {0, 64});
  }
}
