package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133631.
 * @author Sean A. Irvine
 */
public class A133631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133631() {
    super(new long[] {-4, 1}, new long[] {1, 2});
  }
}
