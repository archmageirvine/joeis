package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159661.
 * @author Sean A. Irvine
 */
public class A159661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159661() {
    super(new long[] {-1, 24}, new long[] {1, 25});
  }
}
