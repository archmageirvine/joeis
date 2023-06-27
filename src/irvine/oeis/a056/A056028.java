package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056028 Numbers k such that k^18 == 1 (mod 19^2).
 * @author Sean A. Irvine
 */
public class A056028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056028() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 28, 54, 62, 68, 69, 99, 116, 127, 234, 245, 262, 292, 293, 299, 307, 333, 360, 362});
  }
}
