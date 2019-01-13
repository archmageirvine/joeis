package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249127.
 * @author Sean A. Irvine
 */
public class A249127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249127() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 6, 12, 24});
  }
}
