package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198401 8^n+n^8.
 * @author Sean A. Irvine
 */
public class A198401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198401() {
    super(new long[] {-8, 73, -297, 708, -1092, 1134, -798, 372, -108, 17}, new long[] {1, 9, 320, 7073, 69632, 423393, 1941760, 7861953, 33554432, 177264449});
  }
}
