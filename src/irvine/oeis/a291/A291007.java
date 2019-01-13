package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291007.
 * @author Sean A. Irvine
 */
public class A291007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291007() {
    super(new long[] {2, -7, 14, -13, 6}, new long[] {1, 3, 9, 27, 81});
  }
}
