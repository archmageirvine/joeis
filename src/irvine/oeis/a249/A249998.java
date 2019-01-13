package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249998.
 * @author Sean A. Irvine
 */
public class A249998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249998() {
    super(new long[] {12, 13, 0}, new long[] {1, 0, 13});
  }
}
