package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199301.
 * @author Sean A. Irvine
 */
public class A199301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199301() {
    super(new long[] {-64, 16}, new long[] {1, 24});
  }
}
