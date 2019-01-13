package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018206.
 * @author Sean A. Irvine
 */
public class A018206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018206() {
    super(new long[] {330, -173, 24}, new long[] {1, 24, 403});
  }
}
