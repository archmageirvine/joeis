package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273220 a(n) = 8n^2 - 12n + 1.
 * @author Sean A. Irvine
 */
public class A273220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273220() {
    super(2, new long[] {1, -3, 3}, new long[] {9, 37, 81});
  }
}
