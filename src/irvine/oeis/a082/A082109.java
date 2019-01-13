package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082109.
 * @author Sean A. Irvine
 */
public class A082109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082109() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 33});
  }
}
