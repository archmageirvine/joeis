package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082574.
 * @author Sean A. Irvine
 */
public class A082574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082574() {
    super(new long[] {-1, -2, 4}, new long[] {1, 4, 14});
  }
}
