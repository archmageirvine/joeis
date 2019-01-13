package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242669.
 * @author Sean A. Irvine
 */
public class A242669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242669() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 0, 0, 3, 4, 5, 12});
  }
}
