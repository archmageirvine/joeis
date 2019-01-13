package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042102.
 * @author Sean A. Irvine
 */
public class A042102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042102() {
    super(new long[] {-1, 0, 48, 0}, new long[] {23, 24, 1127, 1151});
  }
}
