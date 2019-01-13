package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159680.
 * @author Sean A. Irvine
 */
public class A159680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159680() {
    super(new long[] {1, -399, 399}, new long[] {0, 40, 15960});
  }
}
