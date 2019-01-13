package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159673.
 * @author Sean A. Irvine
 */
public class A159673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159673() {
    super(new long[] {1, -783, 783}, new long[] {0, 56, 43848});
  }
}
