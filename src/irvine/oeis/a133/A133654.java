package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133654.
 * @author Sean A. Irvine
 */
public class A133654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133654() {
    super(new long[] {-1, -1, 3}, new long[] {1, 3, 9});
  }
}
