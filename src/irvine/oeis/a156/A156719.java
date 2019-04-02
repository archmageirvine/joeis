package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156719 a(n) = 144*n^2 - 127*n + 28.
 * @author Sean A. Irvine
 */
public class A156719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156719() {
    super(new long[] {1, -3, 3}, new long[] {45, 350, 943});
  }
}
