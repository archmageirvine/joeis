package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133931.
 * @author Sean A. Irvine
 */
public class A133931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133931() {
    super(new long[] {1, -1, -2, 3}, new long[] {2, 6, 10, 15});
  }
}
