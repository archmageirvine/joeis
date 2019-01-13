package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291247.
 * @author Sean A. Irvine
 */
public class A291247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291247() {
    super(new long[] {-1, -1, 5, 2, -9, -2, 5, 1}, new long[] {1, 2, 5, 10, 24, 49, 112, 238});
  }
}
