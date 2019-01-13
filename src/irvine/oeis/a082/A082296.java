package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082296.
 * @author Sean A. Irvine
 */
public class A082296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082296() {
    super(new long[] {-1, 1, 1}, new long[] {12, 20, 34});
  }
}
