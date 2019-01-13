package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013982.
 * @author Sean A. Irvine
 */
public class A013982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013982() {
    super(new long[] {1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2});
  }
}
