package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159674.
 * @author Sean A. Irvine
 */
public class A159674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159674() {
    super(new long[] {-1, 32}, new long[] {1, 31});
  }
}
