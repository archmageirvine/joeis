package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260190 Kronecker symbol(-6 / 2*n + 1).
 * @author Sean A. Irvine
 */
public class A260190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260190() {
    super(new long[] {-1, 0, 1, 0}, new long[] {1, 0, 1, 1});
  }
}
