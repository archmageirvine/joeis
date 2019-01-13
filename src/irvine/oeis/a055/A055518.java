package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055518.
 * @author Sean A. Irvine
 */
public class A055518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055518() {
    super(new long[] {1, -4, -19, 11, 6}, new long[] {1, 2, 19, 118, 875});
  }
}
