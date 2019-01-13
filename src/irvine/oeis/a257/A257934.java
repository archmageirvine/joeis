package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257934.
 * @author Sean A. Irvine
 */
public class A257934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257934() {
    super(new long[] {-1, -1, -1, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 14, 26});
  }
}
