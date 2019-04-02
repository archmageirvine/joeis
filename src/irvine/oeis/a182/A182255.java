package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182255 81n^2 - 2247n + 15383.
 * @author Sean A. Irvine
 */
public class A182255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182255() {
    super(new long[] {1, -3, 3}, new long[] {15383, 13217, 11213});
  }
}
