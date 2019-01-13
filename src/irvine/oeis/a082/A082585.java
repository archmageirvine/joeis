package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082585.
 * @author Sean A. Irvine
 */
public class A082585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082585() {
    super(new long[] {-1, -4, 6}, new long[] {1, 6, 32});
  }
}
