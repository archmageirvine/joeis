package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127984 a(n) = (n/3 + 7/9)*2^(n - 1) + (-1)^n/9.
 * @author Sean A. Irvine
 */
public class A127984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127984() {
    super(new long[] {-4, 0, 3}, new long[] {1, 3, 7});
  }
}
