package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198854 6*8^n-1.
 * @author Sean A. Irvine
 */
public class A198854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198854() {
    super(new long[] {-8, 9}, new long[] {5, 47});
  }
}
