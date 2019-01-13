package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013987.
 * @author Sean A. Irvine
 */
public class A013987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013987() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 3, 5, 8, 13, 21});
  }
}
