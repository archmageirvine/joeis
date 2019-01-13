package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133513.
 * @author Sean A. Irvine
 */
public class A133513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133513() {
    super(new long[] {-1, 0, 0}, new long[] {0, 1, -3});
  }
}
