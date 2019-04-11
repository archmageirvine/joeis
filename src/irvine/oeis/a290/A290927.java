package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290927 p-INVERT of the positive integers, where p(S) <code>= (1 -</code> S^2)^3.
 * @author Sean A. Irvine
 */
public class A290927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290927() {
    super(new long[] {-1, 12, -63, 196, -414, 636, -731, 636, -414, 196, -63, 12}, new long[] {0, 3, 12, 36, 108, 331, 1008, 3027, 8992, 26502, 77592, 225806});
  }
}
