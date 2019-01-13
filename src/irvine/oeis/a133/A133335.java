package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133335.
 * @author Sean A. Irvine
 */
public class A133335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133335() {
    super(new long[] {5, 0, 0}, new long[] {1, 2, 3});
  }
}
