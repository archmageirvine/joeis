package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064754 a(n) = n*8^n - 1.
 * @author Sean A. Irvine
 */
public class A064754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064754() {
    super(new long[] {64, -80, 17}, new long[] {7, 127, 1535});
  }
}
