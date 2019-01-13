package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159938.
 * @author Sean A. Irvine
 */
public class A159938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159938() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 6, 16, 36});
  }
}
