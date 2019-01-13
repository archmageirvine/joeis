package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133628.
 * @author Sean A. Irvine
 */
public class A133628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133628() {
    super(new long[] {-4, 4, 1}, new long[] {1, 4, 8});
  }
}
