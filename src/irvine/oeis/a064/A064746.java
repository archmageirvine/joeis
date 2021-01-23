package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064746 a(n) = n*8^n + 1.
 * @author Sean A. Irvine
 */
public class A064746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064746() {
    super(new long[] {64, -80, 17}, new long[] {1, 9, 129});
  }
}
