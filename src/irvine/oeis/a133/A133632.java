package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133632.
 * @author Sean A. Irvine
 */
public class A133632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133632() {
    super(new long[] {5, 0}, new long[] {1, 4});
  }
}
