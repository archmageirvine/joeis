package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082587.
 * @author Sean A. Irvine
 */
public class A082587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082587() {
    super(new long[] {1, 0, 1, 0}, new long[] {3, 1, 4, 3});
  }
}
