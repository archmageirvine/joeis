package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137880.
 * @author Sean A. Irvine
 */
public class A137880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137880() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {1, 49, 225, 23409, 108241});
  }
}
