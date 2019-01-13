package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008502.
 * @author Sean A. Irvine
 */
public class A008502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008502() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 10, 55, 220, 715, 2002, 5005, 11440, 24310});
  }
}

