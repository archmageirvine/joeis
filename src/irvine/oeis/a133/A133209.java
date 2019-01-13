package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133209.
 * @author Sean A. Irvine
 */
public class A133209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133209() {
    super(new long[] {4, -6, 4}, new long[] {3, 2, 0});
  }
}
