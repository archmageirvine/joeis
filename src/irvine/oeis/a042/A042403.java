package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042403.
 * @author Sean A. Irvine
 */
public class A042403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042403() {
    super(new long[] {-1, 0, 54, 0}, new long[] {1, 1, 53, 54});
  }
}
