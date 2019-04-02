package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245968 The edge independence number of the Lucas cube Lambda(n).
 * @author Sean A. Irvine
 */
public class A245968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245968() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 0, 1, 1, 3});
  }
}
