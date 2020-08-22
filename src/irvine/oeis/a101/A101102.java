package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101102 Fifth partial sums of cubes (A000578).
 * @author Sean A. Irvine
 */
public class A101102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101102() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 13, 82, 354, 1200, 3432, 8646, 19734, 41613});
  }
}
