package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228142.
 * @author Sean A. Irvine
 */
public class A228142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228142() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 21, 30, 82, 99});
  }
}
