package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192777.
 * @author Sean A. Irvine
 */
public class A192777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192777() {
    super(new long[] {1, 1, -6, -1, 6, 1}, new long[] {1, 0, 1, 1, 2, 8});
  }
}
