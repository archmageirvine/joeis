package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007981.
 * @author Sean A. Irvine
 */
public class A007981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007981() {
    super(new long[] {0, 0, 0, -1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 2, 4, 6});
  }
}
