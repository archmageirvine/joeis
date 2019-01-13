package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082041.
 * @author Sean A. Irvine
 */
public class A082041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082041() {
    super(new long[] {1, -3, 3}, new long[] {1, 21, 73});
  }
}
