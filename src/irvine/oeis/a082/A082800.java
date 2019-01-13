package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082800.
 * @author Sean A. Irvine
 */
public class A082800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082800() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {12, 20, 32, 4, 52, 60, 72, 8});
  }
}
