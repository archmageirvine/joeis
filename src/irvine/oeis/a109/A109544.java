package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109544.
 * @author Sean A. Irvine
 */
public class A109544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109544() {
    super(new long[] {1, 1, 1, 1, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
