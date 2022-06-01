package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198412 a(n) = (3^(6*n) - 2^(6*n))/35.
 * @author Sean A. Irvine
 */
public class A198412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198412() {
    super(new long[] {-46656, 793}, new long[] {0, 19});
  }
}
