package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082799.
 * @author Sean A. Irvine
 */
public class A082799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082799() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {12, 21, 3, 42, 51, 6});
  }
}
