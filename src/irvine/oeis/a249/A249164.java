package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249164.
 * @author Sean A. Irvine
 */
public class A249164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249164() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 3, 113, 331, 11121});
  }
}
