package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290778.
 * @author Sean A. Irvine
 */
public class A290778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290778() {
    super(new long[] {-1, 2, 0, 0, -2, -2, 3, 0, 3, -2, -2, 0, 0, 2}, new long[] {0, 0, 0, 2, 5, 11, 22, 37, 61, 95, 141, 203, 288, 393});
  }
}
