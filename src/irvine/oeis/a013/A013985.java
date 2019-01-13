package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013985.
 * @author Sean A. Irvine
 */
public class A013985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013985() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 3, 5, 8});
  }
}
