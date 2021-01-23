package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102105 a(n) = (19*5^n - 16*3^n + 1) / 4.
 * @author Sean A. Irvine
 */
public class A102105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102105() {
    super(new long[] {15, -23, 9}, new long[] {1, 12, 83});
  }
}
