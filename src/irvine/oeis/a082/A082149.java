package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082149.
 * @author Sean A. Irvine
 */
public class A082149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082149() {
    super(new long[] {-27, 108, -171, 136, -57, 12}, new long[] {0, 0, 1, 6, 30, 140});
  }
}
