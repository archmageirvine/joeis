package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133405.
 * @author Sean A. Irvine
 */
public class A133405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133405() {
    super(new long[] {3, -1, 0, 3}, new long[] {0, 0, 0, 1});
  }
}
