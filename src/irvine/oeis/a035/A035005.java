package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035005.
 * @author Sean A. Irvine
 */
public class A035005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035005() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 12, 56, 152});
  }
}
