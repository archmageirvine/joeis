package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292399.
 * @author Sean A. Irvine
 */
public class A292399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292399() {
    super(new long[] {-4, -8, 0, 4}, new long[] {2, 7, 22, 69});
  }
}
