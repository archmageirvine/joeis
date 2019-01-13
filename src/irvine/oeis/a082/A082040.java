package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082040.
 * @author Sean A. Irvine
 */
public class A082040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082040() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 43});
  }
}
