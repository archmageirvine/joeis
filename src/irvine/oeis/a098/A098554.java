package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098554.
 * @author Sean A. Irvine
 */
public class A098554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098554() {
    super(new long[] {-1, -1, -2, -1}, new long[] {0, 1, -1, -2});
  }
}
