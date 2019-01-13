package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242709.
 * @author Sean A. Irvine
 */
public class A242709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242709() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 2, 12, 33, 85, 165, 315, 518});
  }
}
