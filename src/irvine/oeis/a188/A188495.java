package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188495.
 * @author Sean A. Irvine
 */
public class A188495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188495() {
    super(new long[] {1, 2, 0, 2, 4, -2, -10, -16, -2, 8, 10, 0, 2, 2}, new long[] {0, 1, 2, 4, 10, 36, 120, 368, 1089, 3304, 10168, 31312, 95880, 293120});
  }
}
