package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169833.
 * @author Sean A. Irvine
 */
public class A169833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169833() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {2, 32, 170, 596, 1690});
  }
}
