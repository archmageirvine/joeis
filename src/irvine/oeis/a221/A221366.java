package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221366.
 * @author Sean A. Irvine
 */
public class A221366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221366() {
    super(new long[] {1, 0, -8, 0, 8, 0}, new long[] {1, 5, 1, 45, 1, 320});
  }
}
