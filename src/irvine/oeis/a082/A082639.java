package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082639.
 * @author Sean A. Irvine
 */
public class A082639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082639() {
    super(new long[] {1, -7, 7}, new long[] {0, 2, 16});
  }
}
