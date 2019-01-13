package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242563.
 * @author Sean A. Irvine
 */
public class A242563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242563() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 0, 2, 3});
  }
}
