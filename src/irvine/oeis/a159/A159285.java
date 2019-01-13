package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159285.
 * @author Sean A. Irvine
 */
public class A159285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159285() {
    super(new long[] {2, 1, 0}, new long[] {1, 3, 1});
  }
}
