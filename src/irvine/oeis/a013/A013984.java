package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013984.
 * @author Sean A. Irvine
 */
public class A013984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013984() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 3, 5});
  }
}
